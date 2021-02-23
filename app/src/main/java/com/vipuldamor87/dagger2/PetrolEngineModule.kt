package com.vipuldamor87.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class PetrolEngineModule {


    @Provides
     fun providePetrolEngine(petrolEngine: PetrolEngine): Engine{
         return petrolEngine
     }
}