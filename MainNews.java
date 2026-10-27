package observerPattern;
import java.util.*;

public class MainNews {
    public static void main(String[] args){
        Subscriber patrick = new Subscriber();
        patrick.setSubscriberName("Patrick");

        Subscriber bbm = new Subscriber();
        bbm.setSubscriberName("BBM");

        Subscriber rene = new Subscriber();
        rene.setSubscriberName("Rene");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(patrick);
        subscriberList.add(bbm);
        subscriberList.add(rene);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsTitle("Global Tech Breakthrough");
        newsAgency.setNewsContent("Scientists achieve major quantum computing milestone.");
        newsAgency.setSubscriberList(subscriberList);

        System.out.println("Breaking News Updates!");
        System.out.println(newsAgency.notifySubscriber());

        newsAgency.detach(bbm);

        Subscriber vem = new Subscriber();
        vem.setSubscriberName("Vem");
        newsAgency.attach(vem);


        System.out.println("Updates recently!");
        System.out.println(newsAgency.notifySubscriber());
    }
}