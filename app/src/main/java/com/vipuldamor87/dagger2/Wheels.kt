package com.vipuldamor87.dagger2

import javax.inject.Inject

class Wheels {

lateinit var  rims: Rims
lateinit var tires: Tires
    constructor(rims: Rims,tires: Tires){
        this.rims = rims
        this.tires = tires

    }
}