<template>
  <v-dialog max-width="500" v-model="dialog">
    <template v-slot:activator="{ props: activatorProps }">
      <v-btn
        v-bind="activatorProps"
        text="Novo"
        variant="flat"
        color="blue"
        prepend-icon="mdi-plus"
      >
        Novo
      </v-btn>
    </template>

    <template v-slot:default>
      <v-card class="border">
        <v-card-title>Novo professor</v-card-title>
        <v-divider></v-divider>

        <v-card-text>
          <v-form ref="form" v-model="valid">
            <v-container>
              <v-row>
                <v-col cols="6">
                  <v-text-field
                    v-model="teacherFirstName"
                    :counter="10"
                    :rules="nameRules"
                    label="Nome"
                    variant="outlined"
                    required
                  ></v-text-field>
                </v-col>

                <v-col cols="6">
                  <v-text-field
                    v-model="teacherLastName"
                    :counter="10"
                    :rules="nameRules"
                    label="Sobrenome"
                    variant="outlined"
                    required
                  ></v-text-field>
                </v-col>

                <v-col cols="12">
                  <v-text-field
                    v-model="teacherEmail"
                    :rules="emailRules"
                    label="E-mail"
                    variant="outlined"
                    required
                  ></v-text-field>
                </v-col>
              </v-row>
            </v-container>
          </v-form>
        </v-card-text>

        <v-divider></v-divider>
        <v-card-actions class="d-flex justify-space-between pl-10 pr-10">
          <v-btn
            variant="flat"
            prepend-icon="mdi-content-save"
            color="success"
            @click="save"
            >Salvar</v-btn
          >
          <v-btn
            variant="flat"
            color="warning"
            prepend-icon="mdi-close"
            text="Fechar"
            @click="dialog = false"
            >Fechar</v-btn
          >
        </v-card-actions>
      </v-card>
    </template>
  </v-dialog>
</template>

<script>
import axios from "axios";

export default {
  props: {
    showSnackbar: Boolean,
  },
  data() {
    return {
      dialog: false,
      valid: false,
      teacherFirstName: "",
      teacherLastName: "",
      teacherEmail: "",
      nameRules: [
        (v) => !!v || "Nome é obrigatório",
        (v) => (v && v.length <= 12) || "Nome deve ter no máximo 12 caracteres",
      ],
      emailRules: [
        (v) => !!v || "E-mail é obrigatório",
        (v) => /.+@.+\..+/.test(v) || "E-mail deve ser válido",
      ],
    };
  },
  methods: {
    async save() {
      if (this.$refs.form.validate() && this.valid) {
        try {
          const response = await axios.post(
            "http://localhost:8080/createTeacher",
            {
              teacherFirstName: this.teacherFirstName,
              teacherLastName: this.teacherLastName,
              teacherEmail: this.teacherEmail,
            }
          );

          this.dialog = false;
        } catch (error) {}
      }
    },
  },
};
</script>

<style></style>
