package com.vipuldamor87.dagger2

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {

    var powerCapacity: Int
    var engineCapacity: Int

    @Inject
    constructor(@Named("power")powerCapacity:Int, @Named("engine")engineCapacity:Int){
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity

    }
    override fun start() {
        System.out.println("petrol engine start :Powercapacity ="+ powerCapacity )
        System.out.println("petrol engine start :Enginecapacity ="+ engineCapacity )
    }
}