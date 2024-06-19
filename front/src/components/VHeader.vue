<template>
  <v-navigation-drawer flat v-model="toggleMenu" class="border">
    <v-list density="compact" nav>
      <v-list-item
        prepend-icon="mdi-home"
        title="Inicio"
        :to="{ name: 'home' }"
      ></v-list-item>
      <v-list-item
        prepend-icon="mdi-book-open-variant"
        title="Cursos"
        :to="{ name: 'courses' }"
      ></v-list-item>
      <v-list-item
        prepend-icon="mdi-map-marker"
        title="Salas"
        :to="{ name: 'rooms' }"
      ></v-list-item>
      <v-list-item
        prepend-icon="mdi-calendar-clock"
        title="Horários"
        :to="{ name: 'scheadules' }"
      ></v-list-item>
      <v-list-item
        prepend-icon="mdi-book-multiple"
        title="Disciplinas"
        :to="{ name: 'subjects' }"
      ></v-list-item>
      <v-list-item
        prepend-icon="mdi-account-group"
        title="Professores"
        :to="{ name: 'teachers' }"
      ></v-list-item>
    </v-list>
  </v-navigation-drawer>

  <v-app-bar flat class="border-b">
    <v-app-bar-nav-icon @click="toggleMenu = !toggleMenu"> </v-app-bar-nav-icon>
    <v-app-bar-title>Univille Calendar</v-app-bar-title>

    <template #append>
      <v-list width="200">
        <v-list-item
          prepend-avatar="https://img.quizur.com/f/img6300f25c178f07.26094452.png?lastEdited=1661006458"
          subtitle="m.vieira_13@hotmail.com"
          title="Mateus Vieira"
        ></v-list-item>
      </v-list>
    </template>
  </v-app-bar>
</template>

<script>
export default {
  data() {
    return {
      toggleMenu: false,
    };
  },
};
</script>
