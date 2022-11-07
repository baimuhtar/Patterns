package behavioral_patterns.template_method;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }
    public void showPageContent(){
    }
}
