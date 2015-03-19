package ro.ciclogetii.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Narcis11 on 19.03.2015.
 */
public class Ribbit extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "QUeWOYH4oEtSeGpHvYFepmGJX7ed7ysU8WwTsF4K", "09k0ADxlwQ67uFbrlRvBN3pGWLkMdXDkbo62izNM");

    }
}
