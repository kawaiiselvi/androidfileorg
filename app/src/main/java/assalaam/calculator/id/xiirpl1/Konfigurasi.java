package assalaam.calculator.id.xiirpl1;

/**
 * Created by Administrator on 11/22/2017.
 */

public class Konfigurasi
{
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.2.18/android/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.2.18/android/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.2.18/android/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.2.18/android/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.2.18/android/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_KELAS = "class"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_NO = "number";//salary itu variabel untuk gajih
    public static final String KEY_EMP_ALAMAT = "address";
    public static final String KEY_EMP_CITA = "ambition";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_KELAS = "class";
    public static final String TAG_NO = "number";
    public static final String TAG_ALAMAT = "address";
    public static final String TAG_CITA = "ambition";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
