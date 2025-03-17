# crm-optimization
Bu proje iki ana bileşenden oluşur:
1)Müşteri Destek Temsilcisi Yönlendirme
Müşterilerin taleplerine en uygun müşteri temsilcileri atanır.
Şehir bazlı eşleştirme ve temsilci uygunluğu göz önünde bulundurulur.
Greedy (Açgözlü) + Dinamik Programlama yaklaşımı kullanılmıştır.
2)Pazarlama Kampanyası Seçimi
Bütçe sınırlamaları altında maksimum yatırım getirisi (ROI) sağlayan kampanyalar seçilir.
Knapsack (Sırt Çantası) problemi DP ile çözülmüştür.

Bu projede iki önemli dinamik programlama algoritması kullanılmıştır:
1)Müşteri Destek Temsilcisi Yönlendirme Algoritması
Amaç:Müşterileri aynı şehirde bulunan ve müsait olan temsilcilere yönlendirmek.
Nasıl Çalışıyor?:Tüm müşteriler tek tek alınır.Temsilciler listesi taranır.Uygun olan ilk temsilci atanır ve meşgul olarak işaretlenir.
Zaman Kompleksitesi:O(n * m) → n müşteri, m temsilci olduğu durumda.Greedy yaklaşımı kullanıldığından optimal bir çözüm sunar.
2)Pazarlama Kampanyası Seçimi Algoritması (Knapsack Problemi)
Amaç:Bütçeyi aşmadan en yüksek yatırım getirisini (ROI) sağlayan kampanyaları seçmek.
Nasıl Çalışıyor?:Knapsack (Sırt Çantası) algoritması temel alınmıştır.Dinamik programlama (DP) tablosu oluşturulur.Kampanya bütçeleri ve getirileri kullanılarak en iyi kombinasyon hesaplanır.
Zaman Kompleksitesi:O(n * B) → n kampanya, B bütçe olduğu durumda.
