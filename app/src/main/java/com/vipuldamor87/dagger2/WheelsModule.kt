package com.vipuldamor87.dagger2

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun providesRims(): Rims{
        System.out.println("rims Created")
        return Rims()
    }
    @Provides
    fun providesTires():Tires{
        System.out.println("Tires Created")
        return Tires()
    }
    @Provides
    fun providesWheels(rims: Rims,tires: Tires):Wheels{
        System.out.println("Wheels Module")
        return Wheels(rims,tires)
    }
}