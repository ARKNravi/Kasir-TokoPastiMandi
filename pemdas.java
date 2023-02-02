import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class konsep3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toko Pasti Mandi");
        JLabel program = new JLabel("TOKO PASTI MANDI");
        JPanel garisBiru = new JPanel();
        JLabel labelnama = new JLabel("Nama");
        JTextField namaPembeli = new JTextField("");
        JLabel hargaSikat = new JLabel("/Rp. 21.000,00");
        JLabel labelSikat = new JLabel("Sikat Gigi ");
        JTextField sikatGigi = new JTextField("0");
        JLabel hargaFoam = new JLabel("/Rp. 15.000,00");
        JLabel labelFoam = new JLabel("Facial Foam ");
        JTextField facialFoam = new JTextField("0");
        JLabel hargaCukur = new JLabel("/Rp.  4.500,00");
        JLabel labelCukur = new JLabel("Alat Cukur ");
        JTextField alatCukur = new JTextField("0");
        JLabel labelPembeli = new JLabel("Masukkan Nominal Uang");
        JTextField uang = new JTextField("0");

        ImageIcon pic1 = new ImageIcon("gambar/sikat.png");
        JLabel Pic1 = new JLabel(pic1);
        Pic1.setBounds(70,-250,500,900);
        frame.getContentPane().add(Pic1);
        pic1.setImage(pic1.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH));

        ImageIcon pic2 = new ImageIcon("gambar/foam.png");
        JLabel Pic2 = new JLabel(pic2);
        Pic2.setBounds(70,-170,500,900);
        frame.getContentPane().add(Pic2);
        pic2.setImage(pic2.getImage().getScaledInstance(50,80,Image.SCALE_SMOOTH));

        ImageIcon pic3 = new ImageIcon("gambar/cukur.png");
        JLabel Pic3 = new JLabel(pic3);
        Pic3.setBounds(70,-90,500,900);
        frame.add(Pic3);
        pic3.setImage(pic3.getImage().getScaledInstance(50,70,Image.SCALE_SMOOTH));

        JButton hitung = new JButton("Bayar");

        program.setBounds(100,30,250,30);
        program.setFont(new Font("ITC Cheltenham",Font.BOLD,25));
        program.setForeground(Color.WHITE);

        garisBiru.setBackground(Color.BLUE);
        garisBiru.setBounds(0,20,500,50);

        labelnama.setBounds(40,80,200,30);
        namaPembeli.setBounds(40,110,200,30);

        hargaSikat.setBounds(150,180,200,30);
        labelSikat.setBounds(40,150,200,30);
        sikatGigi.setBounds(40,180, 100,30);

        hargaFoam.setBounds(150,260,200,30);
        labelFoam.setBounds(40,220,200,30);
        facialFoam.setBounds(40,260, 100,30);

        hargaCukur.setBounds(150,330,200,30);
        labelCukur.setBounds(40,300,200,30);
        alatCukur.setBounds(40,330, 100,30);

        labelPembeli.setBounds(40,380,200,30);
        uang.setBounds(40,410,200,30);

        hitung.setBounds(110,500,200,30);

        frame.add(program);
        frame.add(garisBiru);
        frame.add(uang);
        frame.add(labelnama);
        frame.add(namaPembeli);
        frame.add(labelPembeli);
        frame.add(uang);
        frame.add(hargaSikat);
        frame.add(hargaFoam);
        frame.add(hargaCukur);
        frame.add(labelSikat);
        frame.add(labelCukur);
        frame.add(labelFoam);
        frame.add(hitung);
        frame.add(sikatGigi);
        frame.add(facialFoam);
        frame.add(alatCukur);

        frame.setSize(450,600);
        frame.setLayout(null);
        frame.setVisible(true);

        hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameStruk = new JFrame("Struk Pembelian");

                LocalDateTime dateTime = LocalDateTime.now();
                DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy    HH:mm");
                String time = dateTime.format(formatWaktu);

                int jumlahSikat,jumlahFoam,jumlahCukur,uangPembeli;
                int totalSikat, totalFoam, totalCukur;
                String User,tulisSikat, tulisFoam, tulisCukur;
                User = namaPembeli.getText();
                jumlahSikat = Integer.parseInt(sikatGigi.getText());
                jumlahFoam = Integer.parseInt(facialFoam.getText());
                jumlahCukur = Integer.parseInt(alatCukur.getText());
                uangPembeli = Integer.parseInt(uang.getText());
                JTextArea barang = new JTextArea();

                JPanel struk = new JPanel();
                JPanel garisBiru = new JPanel();
                JLabel program = new JLabel("TOKO PASTI MANDI");
                JLabel alamat = new JLabel("Rumah Megachan Gg.Banteng no.9");
                JLabel alamat2 = new JLabel("KOTA MALANG");
                JLabel alamat3 = new JLabel("0898882828");
                JLabel labelNama = new JLabel("Pembeli              :");
                JLabel nama = new JLabel(User);
                JLabel labelWaktu = new JLabel("Waktu                 :");
                JLabel waktu = new JLabel(time);
                JLabel acr1 = new JLabel("===============================================");
                JLabel struk1 = new JLabel("Barang                                     Jumlah                             Subtotal");

                int total = 0;
                if(jumlahSikat>0){
                    tulisSikat = "Sikat Gigi";
                    totalSikat = jumlahSikat * 21000;
                    total += jumlahSikat * 21000;
                    barang.append(String.format("%-11s\t\t%-4d\tRp.%16d\n",tulisSikat,jumlahSikat,totalSikat));
                }
                if (jumlahFoam>0) {
                    tulisFoam = "Facial Foam";
                    totalFoam = jumlahFoam * 15000;
                    total = jumlahFoam * 15000;
                    barang.append(String.format("%-11s\t\t%-4d\tRp.%16d\n",tulisFoam,jumlahFoam,totalFoam));
                }
                if (jumlahCukur>0) {
                    tulisCukur = "Alat Cukur";
                    totalCukur = jumlahCukur * 4500;
                    total = jumlahCukur * 15000;
                    barang.append(String.format("%-11s\t\t%-4d\tRp.%16d\n",tulisCukur,jumlahCukur,totalCukur));
                }

                int kembalian = uangPembeli - total;

                JLabel acr2 = new JLabel("===============================================");
                JLabel labelTotal = new JLabel("Total");
                JLabel labeltotal = new JLabel("Rp."+total);
                JLabel acr3 = new JLabel("===============================================");
                JLabel labelUangPembeli = new JLabel("Uang Pembeli");
                JLabel labelUangUser = new JLabel("Rp."+uangPembeli);
                JLabel labelKembalian = new JLabel("Kembali");
                JLabel labelUangKembali = new JLabel("Rp."+kembalian);
                JLabel acr4 = new JLabel("===============================================");
                JLabel sukses = new JLabel("TRANSAKSI BERHASIL");
                JLabel acr5 = new JLabel("===============================================");
                JLabel penutup = new JLabel("Terima kasih telah berbelanja");

                garisBiru.setBackground(Color.BLUE);
                program.setForeground(Color.WHITE);

                sukses.setFont(new Font("ITC Cheltenham",Font.CENTER_BASELINE,25));
                program.setFont(new Font("ITC Cheltenham",Font.BOLD,25));
                penutup.setFont(new Font("Brush Script Std",Font.LAYOUT_LEFT_TO_RIGHT,25));

                garisBiru.setBounds(0,20,500,50);
                program.setBounds(100,30,250,30);
                alamat.setBounds(120,70,250,30);
                alamat2.setBounds(170,90,250,30);
                alamat3.setBounds(180,110,250,30);
                labelNama.setBounds(50,140,250,30);
                nama.setBounds(150,140,250,30);
                labelWaktu.setBounds(50,160,250,30);
                waktu.setBounds(150,160,250,30);
                acr1.setBounds(50,190, 1000,25);
                struk1.setBounds(50,210,500,30);
                acr2.setBounds(50,310, 1000,25);
                labelTotal.setBounds(50,330,250,30);
                labeltotal.setBounds(333,330,250,30);
                acr3.setBounds(50,360, 1000,25);
                labelUangPembeli.setBounds(50,380,250,30);
                labelUangUser.setBounds(333,380,250,30);
                labelKembalian.setBounds(50,400,250,30);
                labelUangKembali.setBounds(333,400,250,30);
                acr4.setBounds(50,430, 1000,25);
                sukses.setBounds(100,445,500,30);
                acr5.setBounds(50,470, 1000,25);
                penutup.setBounds(73,500,500,30);
                barang.setBounds(50,250,450,70);


                struk.add(barang);
                struk.add(program);
                struk.add(garisBiru);
                struk.add(alamat);
                struk.add(alamat2);
                struk.add(alamat3);
                struk.add(labelNama);
                struk.add(nama);
                struk.add(labelWaktu);
                struk.add(waktu);
                struk.add(acr1);
                struk.add(struk1);
                struk.add(acr2);
                struk.add(labelTotal);
                struk.add(labeltotal);
                struk.add(acr3);
                struk.add(labelUangPembeli);
                struk.add(labelUangUser);
                struk.add(labelKembalian);
                struk.add(labelUangKembali);
                struk.add(acr4);
                struk.add(sukses);
                struk.add(acr5);
                struk.add(penutup);

                struk.setLayout(null);
                struk.setBounds(0,0,450,600);
                struk.setBackground(Color.WHITE);
                frameStruk.add(struk);

                frameStruk.setLayout(null);
                frameStruk.setVisible(true);
                frameStruk.setBounds(100,160,450,600);
            }
        });
    }
}
