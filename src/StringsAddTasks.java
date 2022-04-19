public class StringsAddTasks {
    public static void main(String[] args) {
// ������� 5
        /*
�������� ��������, ����������� ���� ������ � �. �. �. �� ��� � �� �������, ��� � ��������.
� �������� �������� ������ �����������:
�. �. �. ����������: �Ivanov Ivan Ivanovich�;
������ fullName � ��� �������� �. �. �. ���������� � ������� ������� - ��� - ��������;
���������� firstName � ��� �������� �����;
���������� middleName � ��� �������� ��������;
���������� lastName � ��� �������� �������.
������ ������� � ������� ������ substring().
         */
        System.out.println("\n*** ������� 5 \n");

        String fullName = "���������� �������� ����������";
        int a = fullName.indexOf(" ");
        int b = fullName.lastIndexOf(" ");
        char[] arrName = fullName.toCharArray();           // ������� �� ������ ������
        for (int i = 0; i <= arrName.length; i++)          // �������� �� ��� ���������
            if (i == a) {                                  //���� ������ ������� ����� ������� ������� �������
                String firstName = fullName.substring(0, a);
                System.out.println(firstName);             //�� ������� ���������1
            } else if (i == b) {                           //���� ������ ������� ����� ������� ���������� �������
                String lastName = fullName.substring(a + 1, b);
                System.out.println(lastName);               //�� ������� ���������1
            } else if (i == arrName.length) {               //���� ������ ������� ����� ��� �����
                String middleName = fullName.substring(b + 1, arrName.length);
                System.out.println(middleName);              //�� ������� ���������3
            }

        System.out.println("\n*** ������� 6 \n");

// ������� 6
/*
�������� ��������� ��������� � ������� � �������: ������� ��������� �. �. �. ���������� � ��������� ���� � ��
 */
        fullName = "������ ���� �����������";

        char[] fullNameChars = fullName.toCharArray();                    // ������� ������ �� ������
        for (int i = 0; i < fullNameChars.length; i++) {                 // �������� �� ��������� �������
            fullNameChars[0] = Character.toUpperCase(fullNameChars[0]);  // ������ ������� ������� � ������� �������
            if (fullNameChars[i] == (' ')) {                            // ���� ������� == �������
                fullNameChars[i + 1] = Character.toUpperCase(fullNameChars[i + 1]); // �� ��������� ������� ������� � �������
                // �������

            }

        }
        System.out.println(fullNameChars);

        System.out.println("\n*** ������� 7 \n");
// ������� 7
 /*
   ������� ��� ������.
������: "135"
������: "246"
�������� �� ���� ����� ����, ���������� ������ "123456".
������������ ���������� ������.
  */


        String firstLine = "135";
        String secondLine = "246";
        char[] fl = firstLine.toCharArray();          // ������� ������ �� ������
        char[] sl = secondLine.toCharArray();         // ������� ������ �� ������
        StringBuilder numLine = new StringBuilder();  // ��������� ����������  ������
        numLine.append(fl[0]);                        // ��������� � ���������� ��������
        numLine.append(sl[0]);
        numLine.append(fl[1]);
        numLine.append(sl[1]);
        numLine.append(fl[2]);
        numLine.append(sl[2]);
        System.out.println(numLine);

        System.out.println("\n*** ������� 8 \n");
// ������� 8
 /*
���� ������ �� ���� ����������� �������� "aabccddefgghiijjkk".
����� ����� � ���������� �����, ������� ����������� � ������.
�������� ��������, ��� ������ �������������, �. �. ����� ���� ���� �� ������.
� ����� � ������� ������ ���� ������� ��������� ���������: "acdgijk".
  */
        StringBuilder newLine = new StringBuilder();
        String doubleChars = "aabccddefgghiijjkk";
        char[] dCh = doubleChars.toCharArray();
        for (int i = 0; i < dCh.length; i++) {
            for (int j = i +1; j < dCh.length; j++) {

                if (dCh[j] == dCh[i]) {
                    newLine.append(dCh[i]);
                }
            }
        }
        System.out.println(newLine);
    }
}