import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class FreelancerServiceTest {
    @Test
    public void testCase1() {
        int income=10_000;
                int expences=3_000;
                int threshold=20_000;
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expences, threshold);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int income=100_000;
        int expences=60_000;
        int threshold=150_000;
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(income, expences, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}