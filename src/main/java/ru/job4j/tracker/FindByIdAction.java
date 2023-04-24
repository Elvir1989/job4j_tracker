package ru.job4j.tracker;

public class FindByIdAction implements  UserAction {

    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Enter item by id ===");
        int id = input.askInt("Enter id ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
