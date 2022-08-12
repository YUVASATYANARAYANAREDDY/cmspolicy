insert into policy(Id,name, tenure, premium, latecharges, benefits,hospital_id)
values ('CMS_P001', 'Activ Assure Diamond', 12, 12860,320,'Chikengunya,Dengue','CMS_H001,CMS_H002,CMS_H005'),
('CMS_P002', 'ReAssure', 10, 9950,249,'BP,Diabeties,Cancer','CMS_H001,CMS_H002'),
('CMS_P004','Star Comprehensive',24,13400,210,'Knee Replacement Surgery','CMS_H003,CMS_H004'),
('CMS_P006','Health Guard Gold',9,8874,428,'BP,Diabeties,Heart Attack','CMS_H001,CMS_H003,CMS_H004');

insert into Benefit(id,name,eligible_claim_amount,member_id,policy_id)
values('CMS_B001','Chikenhunya',6800,NULL,'CMS_P001'),
('CMS_B002','Dengue',6060,'CMS_M001','CMS_P001'),
('CMS_B003'	,'BP',990,NULL,'CMS_P002'),
('CMS_B004','Diabeties',1200,NULL,'CMS_P002'),
('CMS_B005','Cancer',2500,'CMS_M001','CMS_P002'),
('CMS_B006','Accident',670,'CMS_M002,CMS_M004,CMS_M005','CMS_P003'),
('CMS_B007','Knee Replacement Surgery',13400,NULL,'CMS_P004'),
('CMS_B008','Cataract Surgery',14575,NULL,'CMS_P005'),
('CMS_B009','Room Rent',1448,'CMS_M003,CMS_M005','CMS_P007'),
('CMS_B010','LIC New',3182,NULL,'CMS_P008'),
('CMS_B011','Life iTem Plan',4945,'CMS_M002','CMS_P009'),
('CMS_B012'	,'ICU',1500,NULL,'CMS_P010'),
('CMS_B013','Heart Attack',14464,NULL,'CMS_P006');

insert into PolicyProvider (id, hospital_Name, location,phno,is_health_care_provider,policy_id)
values('CMS_H001','Aditya Birla Health Insurance Co. Ltd.','9th Floor, One Indiabulls Centre, Tower 1, Jupiter Mills Compound, S.B. Marg, Elphinstone Road, Mumbai-400013','22-6279-9500','TRUE','CMS_P001,CMS_P002,CMS_P006'),
('CMS_H002','Max Life Insurance Co. Ltd.','3rd, 11th, 12th Floor, DLF Square Building, Jacaranda Marg, DLF City, Phase – II, Gurgaon – 122002, Haryana','0124-4121500','FALSE','CMS_P001,CMS_P002'),
('CMS_H003','Niva Bupa Health Insurance Co Ltd','14th Floor, Capital Cyberscape, Sector 59, Gurugram, Haryana-122102','011-3090-2000','TRUE','CMS_P004,CMS_P006'),
('CMS_H004','Star Health & Allied Insurance Co.Ltd.','New Tank Street, Valluvar Kottam High Road,Nungambakkam,Chennai-600034','044-2828 8802','TRUE','CMS_P004,CMS_P006'),
('CMS_H005','Go Digit General Insurance Ltd','Smartworks Business Center, 1st Floor, Nyati Unitree, West Wing, Samrat Ashok Road, Yerawada, PUNE - 411006',	'020-6749-5454'	,'TRUE','CMS_P001'),
('CMS_H006','Manipal Cigna Health Insurance Company Limited','401/402, 4th Floor, Raheja Titanium, Westren Express Highway, Goregaon (East), Mumbai – 400063','22-6170-3600	','TRUE','CMS_P006');
