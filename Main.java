package observerPattern;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Subscriber patrick = new Subscriber();
        patrick.setSubscriberName("Patrick");

        Subscriber joshua = new Subscriber();
        joshua.setSubscriberName("Joshua");

        Subscriber rei = new Subscriber();
        rei.setSubscriberName("Rei");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(patrick);
        subscriberList.add(joshua);
        subscriberList.add(rei);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsTitle("Global Tech Breakthrough");
        newsAgency.setNewsContent("Scientists achieve major quantum computing milestone.");
        newsAgency.setSubscriberList(subscriberList);

        System.out.println("Breaking News Updates!");
        System.out.println(newsAgency.notifySubscriber());

        Subscriber vem = new Subscriber();
        vem.setSubscriberName("Vem");
        newsAgency.attach(vem);


        System.out.println("Updates recently!");
        System.out.println(newsAgency.notifySubscriber());
    }
}