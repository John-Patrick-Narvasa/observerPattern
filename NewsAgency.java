package observerPattern;

import java.util.List;

public class NewsAgency implements NewsSubject {

    private String newsTitle;
    private String newsContent;
    private List<Subscriber> subscriberList;

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += "Breaking News: " + newsTitle + " - " + newsContent + "\n\n";
        }
        return output;
    }
}