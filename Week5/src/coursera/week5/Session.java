package coursera.week5;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

public class Session {
    @NotNull
    public String getDescriptionNN(){
        //return getStr(); // Exception in thread "main" java.lang.IllegalStateException: @NotNull method coursera/week5/Session.getDescriptionNN must not return null
        return "hey!";
    }

    @Nullable
    public String getDescriptionN(){
        return null;
    }

    public String getDescription(){
        return getStr();
    }



    private String getStr(){
        String s = null;
        if (System.currentTimeMillis() == 0 ) s = "Hey!";
        return s;
    }
}
