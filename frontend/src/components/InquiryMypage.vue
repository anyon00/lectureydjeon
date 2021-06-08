<template>

<v-data-table
    :headers="headers"
    :items="inquiryMypage"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'InquiryMypage',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "courseId", value: "courseId" },
            { text: "classId", value: "classId" },
            { text: "fee", value: "fee" },
            { text: "textBook", value: "textBook" },
            { text: "student", value: "student" },
            { text: "paymentStatus", value: "paymentStatus" },
            { text: "deliveryStatus", value: "deliveryStatus" },
            { text: "paymentId", value: "paymentId" },
            { text: "status", value: "status" },
        ],
        inquiryMypage : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/inquirymypages')

      this.inquiryMypage = temp.data._embedded.inquirymypages;

    },
    methods: {
    }
  }
</script>

