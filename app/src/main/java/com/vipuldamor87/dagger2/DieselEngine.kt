package com.vipuldamor87.dagger2

import javax.inject.Inject

class DieselEngine: Engine {

    @Inject
    constructor(){

    }

    override fun start() {
        System.out.println("Diesel engine start")
    }
}