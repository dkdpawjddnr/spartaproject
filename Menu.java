package project;

// 메인 메뉴판 class (부모)
public class Menu {
    private String name; // 메뉴 이름
    private String description; // 메뉴 설명

    // 생성자
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}