<template class="d-flex">
  <v-main>
    <v-container class="d-flex flex-column justify-center align-center">
      <v-col cols="5" md="5" sm="12" class="d-flex flex-column ga-10">
        <h1>Bem-vindo</h1>
        <v-card class="border">
          <v-card-title class="d-flex pl-5 pr-5 pa-5">Login</v-card-title>
          <v-divider></v-divider>

          <v-card-text>
            <v-form ref="form" v-model="valid">
              <v-container>
                <v-row>
                  <v-col cols="12">
                    <v-text-field
                      v-model="teacherFirstName"
                      :rules="nameRules"
                      label="Usuário"
                      variant="outlined"
                      required
                    ></v-text-field>
                  </v-col>

                  <v-col cols="12">
                    <v-text-field
                      v-model="teacherLastName"
                      :rules="nameRules"
                      label="Senha"
                      variant="outlined"
                      required
                    ></v-text-field>
                  </v-col>
                </v-row>
              </v-container>
            </v-form>
          </v-card-text>

          <v-divider></v-divider>
          <v-card-actions class="d-flex pl-5 pr-5 pa-5">
            <v-btn
              variant="flat"
              prepend-icon="mdi-content-save"
              color="blue"
              width="100%"
              @click="save"
              >Entrar</v-btn
            >
          </v-card-actions>
        </v-card>
      </v-col>
    </v-container>
  </v-main>
</template>

<script>
export default {
  name: "LoginView",
  data() {
    return {
      dialog: false,
      valid: false,
      teacherFirstName: "",
      teacherLastName: "",
      teacherEmail: "",
      usernameRules: [
        (v) => !!v || "Nome é obrigatório",
        (v) => (v && v.length >= 3) || "Nome deve ter pelo menos 3 caracteres",
      ],
      passwordRules: [
        (v) => !!v || "Senha é obrigatório",
        (v) =>
          (v && v.length >= 6) || "Password deve ter pelo menos 6 caracteres",
      ],
    };
  },
};
</script>
<style></style>
