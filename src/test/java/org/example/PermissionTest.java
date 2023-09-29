package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionTest {

    @Test
    public void testPermissionManagerConstructor(){
        PermissionManager test_manager = new PermissionManager();
        assertEquals(test_manager.getmCurrentLevel(), PermissionLevel.USER);
    }

    @Test
    public void testPermissionManagerGetter(){
        PermissionManager test_manager = new PermissionManager();
        test_manager.setmCurrentLevel(PermissionLevel.DEVELOPER);
        assertEquals(test_manager.getmCurrentLevel(), PermissionLevel.DEVELOPER);
    }

    @Test
    public void testPermissionManagerSetter(){
        PermissionManager test_manager = new PermissionManager();
        test_manager.setmCurrentLevel(PermissionLevel.ADMIN);
        assertEquals(test_manager.getmCurrentLevel(), PermissionLevel.ADMIN);
    }
}
