package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet{
    // the main usage of this pattern is to control the access to a specific obejct.
    // in this simple example, we control the access to the websites
    // such that if the hist is not denied, than we proceed the operation to the RealInternet class
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception{
        if (bannedSites.contains(serverHost)){
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
