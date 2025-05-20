package student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentManagerTest {


    @Test
    void addStudentTest(){
        StudentManager sm = new StudentManager();
        sm.addStudent("Virgil");
        assertTrue(sm.hasStudent("Virgil"));
    }

    @Test
    void testAddDuplicateStudent(){
        StudentManager sm = new StudentManager();
        sm.addStudent("Virgil");
        assertThrows(IllegalArgumentException.class, () -> {
            sm.addStudent("Virgil"); // 중복 추가 → 예외 발생해야 통과
        });
    }

    @Test
    void testRemoveStudent(){
        StudentManager sm = new StudentManager();
        sm.addStudent("Virgil");
        sm.removeStudent("Virgil");
        assertFalse(sm.hasStudent("Virgil"));
    }

    @Test
    void testRemoveNonExistStudent() {
        StudentManager sm = new StudentManager();

        assertThrows(IllegalArgumentException.class, () -> {
            sm.removeStudent("Virgil"); // 중복 추가 → 예외 발생해야 통과
        });

    }
    @Test
    void myTest(){
        assertEquals(5, 5);

    }
}
