import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.whatsapp.Fragmentchat;
import com.example.whatsapp.contextFragment;
import com.example.whatsapp.groupFragment;

public class TabsAccessorAdaptor extends FragmentPagerAdapter {
    public TabsAccessorAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Fragmentchat Fragmentchat = new Fragmentchat();
                return Fragmentchat;

            case 1:
                groupFragment GroupFragment = new groupFragment();
                return GroupFragment;


            case 2:
                contextFragment ContextFragment = new contextFragment();
                return ContextFragment;

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "chats";

            case 1:
                return "groups";


            case 2:
                return "contacts";

            default:
                return null;
        }

    }
}