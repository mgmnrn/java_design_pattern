package design_pattern.observer.hollywood;

public class Hollywood {
    public static void main(String[] args) {
        Director bat = new Director("bat");
        Director bold = new Director("bold");

        Actor bayrmaa0 = new Actor("bayrmaa0");
        Actor bayrmaa1 = new Actor("bayrmaa1");
        Actor bayrmaa2 = new Actor("bayrmaa2");
        Actor bayrmaa3 = new Actor("bayrmaa3");
        Actor bayrmaa4 = new Actor("bayrmaa4");

        bayrmaa0.isDirector(bat);
        bayrmaa1.isDirector(bat);
        bayrmaa2.isDirector(bat);
        bayrmaa3.isDirector(bold);
        bayrmaa4.isDirector(bold);

        bat.NotifyAll("Margaash 1 tsagt uulzatsgaay");
        bold.NotifyAll("Unuudur amrana shvv");
    }
}
