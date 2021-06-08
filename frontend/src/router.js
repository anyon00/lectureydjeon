
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClassManager from "./components/ClassManager"

import InquiryMypage from "./components/inquiryMypage"
import CourseManager from "./components/CourseManager"
import DeliveryManager from "./components/DeliveryManager"

import PaymentManager from "./components/PaymentManager"


import CounselManager from "./components/CounselManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/Class',
                name: 'ClassManager',
                component: ClassManager
            },

            {
                path: '/inquiryMypage',
                name: 'inquiryMypage',
                component: inquiryMypage
            },
            {
                path: '/Course',
                name: 'CourseManager',
                component: CourseManager
            },
            {
                path: '/Delivery',
                name: 'DeliveryManager',
                component: DeliveryManager
            },

            {
                path: '/Payment',
                name: 'PaymentManager',
                component: PaymentManager
            },


            {
                path: '/Counsel',
                name: 'CounselManager',
                component: CounselManager
            },



    ]
})
