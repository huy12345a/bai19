public class Use {
    /*
    1. Kiểm tra định dạng ngày tháng: dd/mm/yyyy
     b1: 2 chu so(chu so dau tu 0-2 thi chu so sau tu 0-9,
     chu so dau la 3 thi chu so sau tu 0-1 ---> [0-2][0-9]|3[0,1]
     b2: dau /                         --> \/
     b3: 2 chu so (chu so dau la 0 thi chu so sau tu 0-9,
     chu so dau la 1 thi chu so sau tu 0-2 ---> 0[0-9]|1[0-2]
     b4: dau /                         --> \/
     b5: 4 chu so tu 0-9                   --> [0-9]{4}
     ==> Regex : ([0-2][0-9]|3[0,1])\/0[0-9]|1[0-2]\/[0-9]{4}
    2. Kiểm tra giờ hợp lệ: HH:MM (HH - giờ, MM phút)
     b1 : 2 chu so( chu so dau la 0 hoac 1 thi chu so sau tu 0 -9;
     chu so dau la 2 thi chu so sau tu 0-3) ---> [[0-1][0-9]|2[0-3]
     b2: dau :                              ---> \:
     b3: 2 chu so( chu so dau tu 0-5, chu so sau tu 0-9)--->[0-5][0-9]
     ===> Regex : ([0-1][0-9]|2[0-3])\:[0-5][0-9]
    3.Kiểm tra số thẻ tín dụng: Một số thẻ tín dụng thường có 16 chữ số, có thể được nhóm thành 4 nhóm cách nhau bởi dấu gạch ngang (-) hoặc khoảng trắng.
      b1 : 4 chu so tu 0-9  ---> [0-9]{4}
      b2 :dau - hoac khoang trang ---> [-| ]
      b3 : 4 chu so tu 0-9  ---> [0-9]{4}
      b4 :dau - hoac khoang trang ---> [-| ]
      b5 : 4 chu so tu 0-9  ---> [0-9]{4}
      b6 :dau - hoac khoang trang ---> [-| ]
      b7 : 4 chu so tu 0-9  ---> [0-9]{4}
      ===> Regex: [0-9]{4}[-| ][0-9]{4}[-| ][0-9]{4}[-| ][0-9]{4}




     */
}

