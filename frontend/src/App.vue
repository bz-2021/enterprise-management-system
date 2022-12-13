<template>
  <div>
    <Header v-show="$route.meta.show"></Header>
    <router-view v-if="isRouterAlive"></router-view>
    <Nav v-show="$route.meta.show"></Nav>
  </div>
</template>

<script>
import Header from '@/components/Header'
import Nav from '@/components/Nav'
export default {
  name: 'App',
  components: {
    Header,
    Nav
  },
  provide() {
    return {
      reload: this.reload
    }
  },
  data() {
    return {
      isRouterAlive: true
    }
  },
  methods: {
    reload() {
      this.isRouterAlive = false
      this.$nextTick(function () {
        this.isRouterAlive = true
      })
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
