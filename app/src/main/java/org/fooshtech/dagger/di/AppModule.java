package org.fooshtech.dagger.di;


import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someMethod(){
        return "Some string to retrun";
    }


    @Provides
    static boolean getApp(Application application){
        return application==null;
    }



}
