package driver.conf.factory;

import driver.domain.Sponsor;

/**
 * Created by Edmund.Simons on 2016/04/01.
 */
public class SponsorFactory
{
    public static Sponsor createSponsor(String name, String logoColour)
    {
        Sponsor sponsor = new Sponsor.Builder(name)
                .logoColour(logoColour)
                .build();
        return sponsor;
    }
}
