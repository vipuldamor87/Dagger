package com.vipuldamor87.dagger2

import javax.inject.Inject

class Car {

    lateinit var engine : Engine
    @Inject
    lateinit var wheels : Wheels
    lateinit var driver: Driver

    @Inject
    constructor(engine: Engine,driver: Driver){
       // this.wheels = wheels
        this.engine = engine
        this.driver = driver
    }

    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.provideCar(this)
    }

    fun start()
    {
        System.out.println("Driver: "+driver)
       // System.out.println("wheels:" + wheels)
        //engine.start()
       // System.out.println("driving")
    }
}
