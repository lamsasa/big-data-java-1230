package 어레이리스트객체;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectEz {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("", 2500, "Coffee", ""));
        menuList.add(new MenuInfo("", 2500, "Coffee", "ddd2"));
        MenuInfo menuTest = new MenuInfo("", 2500, "Coffee", "mddd2");
        menuList.add(menuTest);

        for(MenuInfo e : menuList) {
            e.getMenuInfo();
        }
    }
}
