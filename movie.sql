/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : movie

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2019-02-25 14:38:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for back_admin
-- ----------------------------
DROP TABLE IF EXISTS `back_admin`;
CREATE TABLE `back_admin` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `pseudo_deletion` int(11) DEFAULT NULL,
  `session_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of back_admin
-- ----------------------------
INSERT INTO `back_admin` VALUES ('1', 'admin', 'admin', '1', null);

-- ----------------------------
-- Table structure for m_cinema
-- ----------------------------
DROP TABLE IF EXISTS `m_cinema`;
CREATE TABLE `m_cinema` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '电影院id',
  `cinema_name` varchar(64) NOT NULL COMMENT '电影院名字',
  `cinema_address` varchar(255) DEFAULT NULL COMMENT '电影院地址',
  `cinema_phone` varchar(32) NOT NULL COMMENT '电影院练习号码',
  `cinema_glasses` varchar(64) DEFAULT NULL COMMENT '3D眼镜收费',
  `cinema_preferences` varchar(64) DEFAULT NULL COMMENT '儿童优惠',
  `cinema_parking` varchar(64) DEFAULT NULL COMMENT '可停车',
  `cinema_price` int(32) DEFAULT NULL COMMENT '价格',
  `cinema_img` varchar(64) DEFAULT NULL,
  `flag` int(2) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_cinema
-- ----------------------------
INSERT INTO `m_cinema` VALUES ('1', '烽禾影城(祈福新邨店)', '番禺区钟屏路钟福广场3层（祈福新村祈福医院旁）', '020-39108189 020-39108150', '自费购买, 5.0元每副', '1.3m以下儿童观看普通电影免票，每个成年人仅限带一名儿童', '凭电影票免费停车3小时', '23', '/static/cinemas/images/cinemas1.jpg', '1');
INSERT INTO `m_cinema` VALUES ('2', '烽禾影城(科学城店)', '黄埔区科学城科学大道193号高德汇购物中心5层（近创意大厦）', '020-82118486 020-82118586', '自费购买, 3.0元每副', '1.3m以下儿童观看普通电影免票，每个成年人仅限带一名儿童', '下载优托邦APP免费停车3小时', '28', '/static/cinemas/images/cinemas2.jpg', '1');
INSERT INTO `m_cinema` VALUES ('3', '烽禾影城(南村剑桥郡店)', '番禺区雅居乐剑桥郡国际文化中心4楼（近剑桥郡小区）', '020-31134050', '自费购买, 5.0元每副', '1.3m以下儿童观看普通电影免票，每个成年人仅限带一名儿童', '凭电影票免费停车3小时', '28', '/static/cinemas/images/cinemas3.jpg', '1');
INSERT INTO `m_cinema` VALUES ('4', '广东工人电影院', '越秀区南堤二马路36号', '020-83881186', '3元/副', '1.3米以下儿童免票，需家长陪同观看', null, '23', '/static/cinemas/images/cinemas4.jpg', '1');
INSERT INTO `m_cinema` VALUES ('5', '香凝影剧院', '荔湾区芳村大道西塞坝路芳雅苑15号', '020-81005375', '5元/副', '每位观影用户凭一张票可免费带领1名身高1.2米（含）以下儿童同场观影，该儿童观影与大人同座，不予单独出票。', '凭票免费停车', '33', '/static/cinemas/images/cinemas5.jpg', '1');
INSERT INTO `m_cinema` VALUES ('6', '中影JAJ24小时咖啡影院(钟港大厦店)', '白云区钟落潭广从五路491号钟港大厦4楼', '020-31233926', '免费提供3D眼镜', '1.2米以下儿童观影免费，每位成年人仅限带一名儿童观影，满场无座', '免费停车2小时', '38', '/static/cinemas/images/cinemas6.jpg', '1');
INSERT INTO `m_cinema` VALUES ('7', '沙湾3D数字电影院', '番禺区沙湾镇大巷涌路沙湾文化中心1楼（沁芳园对面）', '020-34737921', '免押金', '1.2m（含）以下2D\\3D免费座，需家长陪同', '扬帆广场免费停车场', '50', '/static/cinemas/images/cinemas7.jpg', '1');
INSERT INTO `m_cinema` VALUES ('8', '万达影城(南沙万达广场店)', '南沙区双山大道万达广场三号娱乐楼4楼', '020-39089666', null, '1.3米以下儿童可免费无座观影（VIP厅、IMAX厅除外），一名成人限带一名儿童', null, '43', '/static/cinemas/images/cinemas8.jpg', '1');
INSERT INTO `m_cinema` VALUES ('9', '万达影城(增城万达广场店)', '增城区荔城街增城大道69号万达广场1幢娱乐楼4A-5A（3楼大歌星电梯上去）', '020-26237777', '免押金', '1米以下儿童可免费无座观影（VIP厅、IMAX厅，4D厅除外），一名成人限带一', '万达广场负1、负2停车场', '43', '/static/cinemas/images/cinemas9.jpg', '1');
INSERT INTO `m_cinema` VALUES ('10', '广州蓓蕾剧院', '越秀区东风西路167号或人民北路873号（近人民北路）', '020-81362572', '免押金', null, null, '23', '/static/cinemas/images/cinemas10.jpg', '1');
INSERT INTO `m_cinema` VALUES ('11', '大地影院(西丽店)', '番禺区市桥街西丽南路93号西丽广场4楼（西城花园东）', '020-39046175', '免押金', '1.3m（不含）以下2D\\3D免费，需由1名成人陪同，1.3m（含）以上可凭学生证', null, '33', '/static/cinemas/images/cinemas11.jpg', '1');
INSERT INTO `m_cinema` VALUES ('12', '中影南方韦邦国际影城', '番禺区钟村雄105国道雄峰城B1三楼', '020-39183740', '自费购买, 5.0元每副', '1.3米以上儿童需要购票', '可免费停车6小时', '28', '/static/cinemas/images/cinemas12.jpg', '1');

-- ----------------------------
-- Table structure for m_details
-- ----------------------------
DROP TABLE IF EXISTS `m_details`;
CREATE TABLE `m_details` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_Englist_name` varchar(255) DEFAULT NULL,
  `movie_classify1` varchar(255) DEFAULT NULL,
  `movie_classify2` varchar(255) DEFAULT NULL,
  `movie_classify3` varchar(255) DEFAULT NULL,
  `movie_feel` varchar(255) DEFAULT NULL,
  `movie_length` varchar(255) DEFAULT NULL,
  `movie_date` varchar(255) DEFAULT NULL,
  `movie_score` varchar(255) DEFAULT NULL,
  `movie_intro` varchar(2555) DEFAULT NULL,
  `movie_photo` varchar(255) DEFAULT NULL,
  `flag` int(2) unsigned DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_details
-- ----------------------------
INSERT INTO `m_details` VALUES ('1', '流浪地球', 'The Wandering Earth', '剧情', '冒险', '科幻', '3DIMAX', '128分钟', '2019-02-05', '9.3', '太阳即将毁灭，人类在地球表面建造出巨大的推进器，寻找新家园。然而宇宙之路危机四伏，为了拯救地球，为了人类能在漫长的2500年后抵达新的家园，流浪地球时代的年轻人挺身而出，展开争分夺秒的生死之战。', '/static/image/liulangdiqiu.jpg', '1');
INSERT INTO `m_details` VALUES ('2', '飞驰人生', 'Pegasus', '喜剧', ' ', ' ', '2DIMAX', '98分钟', '2019-02-05', '8.8', '曾经在赛车界叱咤风云、如今却只能经营炒饭大排档的赛车手张驰（沈腾 饰）决定重返车坛挑战年轻一代的天才。然而没钱没车没队友，甚至驾照都得重新考，这场笑料百出不断被打脸的复出之路，还有更多哭笑不得的窘境在等待着这位过气车神……', '/static/image/feichirensheng.jpg', '1');
INSERT INTO `m_details` VALUES ('3', '疯狂的外星人', 'Crazy Alien', '剧情', '喜剧', '科幻', '2DIMAX', '116分钟', '2019-02-05', '8.5', '耿浩（黄渤 饰）与一心想发大财的好兄弟大飞（沈腾 饰），经营着各自惨淡的“事业”，然而“天外来客”（徐峥 饰）的意外降临，打破了二人平静又拮据的生活。神秘的西方力量也派出“哼哈二将”在全球搜查外星人行踪。啼笑皆非的跨物种对决，别开生面的“星战”，在中国某海边城市激情上演。', '/static/image/fengkuangdewaixingren.jpg', '1');
INSERT INTO `m_details` VALUES ('4', '新喜剧之王', 'The New King of Comedy', '剧情', '喜剧', ' ', '2DIMAX', '91分钟', '2019-02-05', '8.0', '一直有个明星梦的小镇大龄女青年如梦（鄂靖文 饰）跑龙套多年未果。她和父亲（张琪 饰）关系紧张，亲友都劝她放弃，只有男友查理（张全蛋 饰）还支持她。在剧组，如梦遇见了年少时启发她演戏的男演员马可（王宝强 饰）。但此时过气多年的马可却因内心自卑而性情狂躁，对如梦百般折磨。如梦仍乐观坚持演戏，然而一次比一次沉重的打击却接踵而来，最后她决定放弃梦想，回到父母身边找了份稳定工作，但却得知自己入围了知名导演新片的大型选角。如梦陷入艰难抉择。', '/static/image/xinxijvzhiwang.jpg', '1');
INSERT INTO `m_details` VALUES ('5', '大黄蜂', 'Bumblebee', '动作 ', '冒险', '科幻', '3DIMAX', '114分钟', '2019-01-04', '9.1', '故事回到1987年，疲于奔命的大黄蜂在一个加州海岸小镇的废弃场找到避难所，一位女孩查莉（海莉·斯坦菲尔德 饰）即将届满18岁，对未来毫无头绪，却无意间发现了伤痕累累、濒临死亡的大黄蜂，查莉救活了他，但她很快就发现他并不只是一台普通的黄色福斯金龟车。', '/static/image/dahuangfeng.jpg', '1');
INSERT INTO `m_details` VALUES ('6', '一吻定情', 'Fall in Love at First Kiss', '喜剧', '爱情', ' ', '2DIMAX', '122分钟', '2019-02-14', '8.6', '笨蛋爱上天才，会有结果吗？平凡女孩原湘琴（林允饰）喜欢上了天才少年江直树（王大陆饰），在她表白失败准备放弃之际，爸爸居然带着自己搬进了直树家里？！一个猛追，一个猛逃，热闹欢腾的纯真高中生活就此上演。朝夕相处中，直树渐渐被湘琴乐观的无畏精神吸引，他开始怀疑：湘琴究竟是人生偏差、还是自己的命中注定?', '/static/image/yiwendingqing.jpg', '1');
INSERT INTO `m_details` VALUES ('7', '死侍2', 'Once upon a Deadpool', '喜剧', '动作 ', '冒险', '2DIMAX', '119分钟', '2019-01-25', '7.4', '漫威史上最贱的雇佣兵死侍再度归来！本与女友过着幸福生活的死侍（瑞安·雷诺兹 饰）被上门寻仇，美好生活岌岌可危。然而悲惨的日子还没结束，死侍还和想要接纳他的X战警剪不断，理还乱。就在这位平日里插科打诨的英雄人生跌入谷底之时，一位强大的时空穿越者——电索（乔什·布洛林 饰）却盯上了死侍想要保护的少年。为迎强敌，死侍广发英雄帖，临时组建了X特攻队。就凭他们真的能打过这位来自未来的敌人么？', '/static/image/sishi.jpg', '1');
INSERT INTO `m_details` VALUES ('8', '\r\n来电狂响', 'Kill Mobile', '剧情', '喜剧', ' ', '2DIMAX', '103分钟', '2018-12-28', '8.6', '七个好友聚餐，有人提议大家玩一个将手机公开的游戏：与在场所有人分享当晚收到的每一条短信、每一个电话，每一个弹窗，由此掀开了一场轩然大波。 一条短信，拆散一对恩爱夫妻；一个电话，推翻多年发小感情……数字时代，小小手机藏了无数秘密，当手机变成锋利的利刃，当聚餐局变成“揭 秘局”，信任危机过后他们能否跨越信任危机，重新思考彼此之间的亲密关系………..', '/static/image/laidiankuangxiang.jpg', '1');
INSERT INTO `m_details` VALUES ('9', '神探蒲松龄', 'The Knight of Shadows: Between Yin an', '爱情', '动作', '奇幻', '3D', '108分钟', '2019-02-05', '7.8', '一代文豪蒲松龄（成龙 饰）执阴阳判化身神探，与捕快严飞（林柏宏 饰）联手追踪金华镇少女失踪案。蒲松龄带领“猪狮虎”“屁屁”“忘忧”“千手”等一众小妖深入案情，在找寻真相的过程中，牵扯出一段旷世奇恋。', '/static/image/shentanpusongling.jpg', '1');
INSERT INTO `m_details` VALUES ('10', '廉政风云', 'Integrity', '悬疑', '犯罪', ' ', '2DIMAX', '114分钟', '2019-02-05', '6.9', '廉政公署一宗经历多年调查的严重非法内销行贿案件，竟因首被告理达贸易集团负责人陈超群弃保潜逃，以及唯一重要证人兼举报者，理达的前任财务总监许植尧（张家辉 饰）缺席出庭作证，导致法庭勒令延审一星期！为了7天后案件顺利重审，ICAC展开全面行动。负责此案的队长陈敬慈（刘青云 饰）和负责寻找证人的江雪儿（林嘉欣 饰）原是廉政公署一对恩爱夫妻，如今已分居多时，为了案件不得不联手合作。在抓捕陈超群和寻找许植尧的过程中两人都意外发现他们背后隐藏的另一重身份。一个谜团的解开是另一个谜团的开启，背后的阴谋远远超出所有人的想象，烟幕笼罩下光明之路在何方？', '/static/image/lanzhengfengyun.jpg', '1');

-- ----------------------------
-- Table structure for m_intro
-- ----------------------------
DROP TABLE IF EXISTS `m_intro`;
CREATE TABLE `m_intro` (
  `movie_id` int(32) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_Englist_name` varchar(255) DEFAULT NULL,
  `movie_classify1` varchar(255) DEFAULT NULL,
  `movie_classify2` varchar(255) DEFAULT NULL,
  `movie_classify3` varchar(255) DEFAULT NULL,
  `movie_posters` varchar(255) DEFAULT NULL,
  `movie_star` varchar(255) DEFAULT NULL,
  `movie_photo` varchar(255) DEFAULT NULL,
  `movie_intro` varchar(2555) DEFAULT NULL,
  `movie_picture1` varchar(255) DEFAULT NULL,
  `movie_picture2` varchar(255) DEFAULT NULL,
  `movie_picture3` varchar(255) DEFAULT NULL,
  `movie_picture4` varchar(255) DEFAULT NULL,
  `movie_picture5` varchar(255) DEFAULT NULL,
  `movie_picture6` varchar(255) DEFAULT NULL,
  `flag` varchar(2) DEFAULT '1',
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_intro
-- ----------------------------
INSERT INTO `m_intro` VALUES ('1', '流浪地球', 'The Wandering Earth', '剧情', '冒险', '科幻', '/static/image/m1/posters1.jpg', '/static/image/stars.png', '/static/image/m1/liulangdiqiu.jpg', '太阳即将毁灭，人类在地球表面建造出巨大的推进器，寻找新家园。然而宇宙之路危机四伏，为了拯救地球，为了人类能在漫长的2500年后抵达新的家园，流浪地球时代的年轻人挺身而出，展开争分夺秒的生死之战。', '/static/image/m1/liulang1.jpg', '/static/image/m1/liulang2.jpg', '/static/image/m1/liulang3.jpg', '/static/image/m1/liulang4.jpg', '/static/image/m1/liulang5.jpg', '/static/image/m1/liulang6.jpg', '1');
INSERT INTO `m_intro` VALUES ('2', '飞驰人生', 'Pegasus', '喜剧', ' ', ' ', '/static/image/m2/posters2.jpg', '/static/image/stars.png', '/static/image/m2/feichirensheng.jpg', '曾经在赛车界叱咤风云、如今却只能经营炒饭大排档的赛车手张驰（沈腾 饰）决定重返车坛挑战年轻一代的天才。然而没钱没车没队友，甚至驾照都得重新考，这场笑料百出不断被打脸的复出之路，还有更多哭笑不得的窘境在等待着这位过气车神……', '/static/image/m2/feichi1.jpg', '/static/image/m2/feichi2.jpg', '/static/image/m2/feichi3.jpg', '/static/image/m2/feichi4.jpg', '/static/image/m2/feichi5.jpg', '/static/image/m2/feichi6.jpg', '1');
INSERT INTO `m_intro` VALUES ('3', '疯狂的外星人', 'Crazy Alien', '剧情', '喜剧', '科幻', '/static/image/m3/poster3.jpg', '/static/image/stars.png', '/static/image/m3/fengkuangdewaixingren.jpg', '耿浩（黄渤 饰）与一心想发大财的好兄弟大飞（沈腾 饰），经营着各自惨淡的“事业”，然而“天外来客”（徐峥 饰）的意外降临，打破了二人平静又拮据的生活。神秘的西方力量也派出“哼哈二将”在全球搜查外星人行踪。啼笑皆非的跨物种对决，别开生面的“星战”，在中国某海边城市激情上演。', '/static/image/m3/fengk1.jpg', '/static/image/m3/fengk2.jpg', '/static/image/m3/fengk3.jpg', '/static/image/m3/fengk4.jpg', '/static/image/m3/fengk5.jpg', '/static/image/m3/fengk6.jpg', '1');
INSERT INTO `m_intro` VALUES ('4', '新喜剧之王', 'The New King of Comedy', '剧情', '喜剧', ' ', '/static/image/m4/poster4.jpg', '/static/image/stars.png', '/static/image/m4/xinxijvzhiwang.jpg', '一直有个明星梦的小镇大龄女青年如梦（鄂靖文 饰）跑龙套多年未果。她和父亲（张琪 饰）关系紧张，亲友都劝她放弃，只有男友查理（张全蛋 饰）还支持她。在剧组，如梦遇见了年少时启发她演戏的男演员马可（王宝强 饰）。但此时过气多年的马可却因内心自卑而性情狂躁，对如梦百般折磨。如梦仍乐观坚持演戏，然而一次比一次沉重的打击却接踵而来，最后她决定放弃梦想，回到父母身边找了份稳定工作，但却得知自己入围了知名导演新片的大型选角。如梦陷入艰难抉择。', '/static/image/m4/king1.jpg', '/static/image/m4/king2.jpg', '/static/image/m4/king3.jpg', '/static/image/m4/king4.jpg', '/static/image/m4/king5.jpg', '/static/image/m4/king6.jpg', '1');
INSERT INTO `m_intro` VALUES ('5', '大黄蜂', 'Bumblebee', '动作 ', '冒险', '科幻', '/static/image/m5/poster5.jpg', '/static/image/stars.png', '/static/image/m5/dahuangfeng.jpg', '故事回到1987年，疲于奔命的大黄蜂在一个加州海岸小镇的废弃场找到避难所，一位女孩查莉（海莉·斯坦菲尔德 饰）即将届满18岁，对未来毫无头绪，却无意间发现了伤痕累累、濒临死亡的大黄蜂，查莉救活了他，但她很快就发现他并不只是一台普通的黄色福斯金龟车。', '/static/image/m5/da1.jpg', '/static/image/m5/da2.jpg', '/static/image/m5/da3.jpg', '/static/image/m5/da4.jpg', '/static/image/m5/da5.jpg', '/static/image/m5/da6.jpg', '1');
INSERT INTO `m_intro` VALUES ('6', '一吻定情', 'Fall in Love at First Kiss', '喜剧', '爱情', ' ', '/static/image/m6/poster6.jpg', '/static/image/stars.png', '/static/image/m6/yiwendingqing.jpg', '笨蛋爱上天才，会有结果吗？平凡女孩原湘琴（林允饰）喜欢上了天才少年江直树（王大陆饰），在她表白失败准备放弃之际，爸爸居然带着自己搬进了直树家里？！一个猛追，一个猛逃，热闹欢腾的纯真高中生活就此上演。朝夕相处中，直树渐渐被湘琴乐观的无畏精神吸引，他开始怀疑：湘琴究竟是人生偏差、还是自己的命中注定?', '/static/image/m6/yi1.jpg', '/static/image/m6/yi2.jpg', '/static/image/m6/yi3.jpg', '/static/image/m6/yi4.jpg', '/static/image/m6/yi5.jpg', '/static/image/m6/yi6.jpg', '1');
INSERT INTO `m_intro` VALUES ('7', '死侍2', 'Once upon a Deadpool', '喜剧', '动作 ', '冒险', '/static/image/m7/poster7.jpg', '/static/image/stars.png', '/static/image/m7/sishi.jpg', '漫威史上最贱的雇佣兵死侍再度归来！本与女友过着幸福生活的死侍（瑞安·雷诺兹 饰）被上门寻仇，美好生活岌岌可危。然而悲惨的日子还没结束，死侍还和想要接纳他的X战警剪不断，理还乱。就在这位平日里插科打诨的英雄人生跌入谷底之时，一位强大的时空穿越者——电索（乔什·布洛林 饰）却盯上了死侍想要保护的少年。为迎强敌，死侍广发英雄帖，临时组建了X特攻队。就凭他们真的能打过这位来自未来的敌人么？', '/static/image/m7/si1.jpg', '/static/image/m7/si2.jpg', '/static/image/m7/si3.jpg', '/static/image/m7/si4.jpg', '/static/image/m7/si5.jpg', '/static/image/m7/si6.jpg', '1');
INSERT INTO `m_intro` VALUES ('8', '来电狂响', 'Kill Mobile', '剧情', '喜剧', ' ', '/static/image/m8/poster8.jpg', '/static/image/stars.png', '/static/image/m8/laidiankuangxiang.jpg', '七个好友聚餐，有人提议大家玩一个将手机公开的游戏：与在场所有人分享当晚收到的每一条短信、每一个电话，每一个弹窗，由此掀开了一场轩然大波。 一条短信，拆散一对恩爱夫妻；一个电话，推翻多年发小感情……数字时代，小小手机藏了无数秘密，当手机变成锋利的利刃，当聚餐局变成“揭 秘局”，信任危机过后他们能否跨越信任危机，重新思考彼此之间的亲密关系………..', '/static/image/m8/lai1.jpg', '/static/image/m8/lai2.jpg', '/static/image/m8/lai3.jpg', '/static/image/m8/lai4.jpg', '/static/image/m8/lai5.jpg', '/static/image/m8/lai8.jpg', '1');
INSERT INTO `m_intro` VALUES ('9', '神探蒲松龄', 'The Knight of Shadows: Between Yin an', '爱情', '动作', '奇幻', '/static/image/m9/poster9.jpg', '/static/image/stars.png', '/static/image/m9/shentanpusongling.jpg', '一代文豪蒲松龄（成龙 饰）执阴阳判化身神探，与捕快严飞（林柏宏 饰）联手追踪金华镇少女失踪案。蒲松龄带领“猪狮虎”“屁屁”“忘忧”“千手”等一众小妖深入案情，在找寻真相的过程中，牵扯出一段旷世奇恋。', '/static/image/m9/shen1.jpg', '/static/image/m9/shen2.jpg', '/static/image/m9/shen3.jpg', '/static/image/m9/shen4.jpg', '/static/image/m9/shen5.jpg', '/static/image/m9/shen6.jpg', '1');
INSERT INTO `m_intro` VALUES ('10', '廉政风云', 'Integrity', '悬疑', '犯罪', ' ', '/static/image/m10/poster10.jpg', '/static/image/stars.png', '/static/image/m10/lanzhengfengyun.jpg', '廉政公署一宗经历多年调查的严重非法内销行贿案件，竟因首被告理达贸易集团负责人陈超群弃保潜逃，以及唯一重要证人兼举报者，理达的前任财务总监许植尧（张家辉 饰）缺席出庭作证，导致法庭勒令延审一星期！为了7天后案件顺利重审，ICAC展开全面行动。负责此案的队长陈敬慈（刘青云 饰）和负责寻找证人的江雪儿（林嘉欣 饰）原是廉政公署一对恩爱夫妻，如今已分居多时，为了案件不得不联手合作。在抓捕陈超群和寻找许植尧的过程中两人都意外发现他们背后隐藏的另一重身份。一个谜团的解开是另一个谜团的开启，背后的阴谋远远超出所有人的想象，烟幕笼罩下光明之路在何方？', '/static/image/m10/lan1.jpg', '/static/image/m10/lan2.jpg', '/static/image/m10/lan3.jpg', '/static/image/m10/lan4.jpg', '/static/image/m10/lan5.jpg', '/static/image/m10/lan6.jpg', '1');

-- ----------------------------
-- Table structure for m_order
-- ----------------------------
DROP TABLE IF EXISTS `m_order`;
CREATE TABLE `m_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `creat_time` datetime DEFAULT NULL COMMENT '创建时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `movie_id` int(11) DEFAULT NULL COMMENT '影视id',
  `moviv_scene` int(11) DEFAULT NULL COMMENT '影视场次',
  `cinema_id` int(11) DEFAULT NULL COMMENT '影院id',
  `seat1` varchar(255) DEFAULT NULL COMMENT '选座1',
  `seat2` varchar(255) DEFAULT NULL COMMENT '选座2',
  `seat3` varchar(255) DEFAULT NULL COMMENT '选座3',
  `seat4` varchar(255) DEFAULT NULL COMMENT '选座4',
  `ticket_number` varchar(255) DEFAULT NULL COMMENT '取票码',
  `is_active` int(11) DEFAULT NULL COMMENT '是否失效（1-未失效 0-失效）',
  `is_pay` int(11) DEFAULT '0' COMMENT '是否支付(0-未支付 1-已支付)',
  `pay_count` int(11) DEFAULT NULL COMMENT '支付金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_order
-- ----------------------------
INSERT INTO `m_order` VALUES ('40', '2019-02-20 22:07:06', '1', '1', '1', '1', 'seat-188', 'seat-189', null, null, 'c290ecbc-2c7e-4427-8c37-0c74ac81b72b', '0', '1', '86');
INSERT INTO `m_order` VALUES ('41', '2019-02-20 22:07:37', '1', '1', '1', '1', 'seat-154', 'seat-171', null, null, 'c29fb337-234d-40e3-8b26-3ca6d58ac58d', '0', '1', '86');
INSERT INTO `m_order` VALUES ('42', '2019-02-21 08:57:15', '1', '1', '1', '1', 'seat-201', 'seat-202', null, null, '605c9ad8-d439-45cd-bf83-ded29ad24ec1', '0', '1', '86');
INSERT INTO `m_order` VALUES ('46', '2019-02-21 11:05:49', '1', '1', '2', '1', 'seat-128', 'seat-129', null, null, 'd2e3f211-00f8-4339-83f1-7aa771f1c86a', '0', '1', '86');
INSERT INTO `m_order` VALUES ('48', '2019-02-21 11:07:34', '1', '2', '3', '1', 'seat-160', null, null, null, 'b10d72e7-1b8f-4bae-afcf-a82a796d418d', '0', '1', '43');
INSERT INTO `m_order` VALUES ('49', '2019-02-21 11:10:38', '1', '2', '3', '1', 'seat-94', 'seat-95', null, null, 'ffc5eae0-c01a-48a9-af75-23ed9fefeeef', '0', '1', '86');
INSERT INTO `m_order` VALUES ('50', '2019-02-21 11:57:01', '1', '4', '33', '6', 'seat-91', 'seat-109', null, null, 'af04aea2-63a8-45d8-a0a2-7483f4e33860', '0', '1', '86');
INSERT INTO `m_order` VALUES ('51', '2019-02-21 12:00:56', '1', '1', '19', '4', 'seat-92', null, null, null, 'e2f5e027-9774-4bc0-8d0e-23585b5f70f5', '0', '1', '43');
INSERT INTO `m_order` VALUES ('52', '2019-02-21 16:34:31', '1', '1', '6', '2', 'seat-92', 'seat-109', null, null, '6c427fbd-9f16-4123-b207-d49bab7d297f', '0', '1', '86');
INSERT INTO `m_order` VALUES ('53', '2019-02-21 16:57:17', '1', '1', '1', '1', 'seat-166', null, null, null, null, '0', '0', '43');
INSERT INTO `m_order` VALUES ('54', '2019-02-21 17:21:14', '1', '1', '1', '1', 'seat-25', null, null, null, null, '0', '0', '43');
INSERT INTO `m_order` VALUES ('55', '2019-02-21 18:42:06', '1', '1', '12', '3', 'seat-92', 'seat-93', null, null, 'ab3e2d1e-b60c-4d11-958d-1f7f14ef21ee', '0', '1', '86');
INSERT INTO `m_order` VALUES ('56', '2019-02-21 18:48:14', '1', '1', '1', '1', 'seat-163', null, null, null, null, '0', '0', '43');
INSERT INTO `m_order` VALUES ('57', '2019-02-21 21:20:35', '1', '1', '6', '2', 'seat-111', 'seat-112', null, null, '8676f83b-40f9-4470-a54e-69868e085769', '0', '1', '86');
INSERT INTO `m_order` VALUES ('58', '2019-02-21 21:28:09', '1', '5', '16', '3', 'seat-95', 'seat-96', null, null, '245b5c03-31f8-4124-955c-c9bb1ffc4017', '0', '1', '86');
INSERT INTO `m_order` VALUES ('59', '2019-02-21 21:29:06', '1', '3', '18', '4', 'seat-114', 'seat-131', null, null, '8e633675-49db-4955-b4bb-3d5e38c333de', '0', '1', '86');
INSERT INTO `m_order` VALUES ('60', '2019-02-21 21:36:44', '1', '8', '31', '6', 'seat-111', 'seat-112', null, null, '35300f65-5925-46de-97a3-656f74aabe47', '0', '1', '86');
INSERT INTO `m_order` VALUES ('61', '2019-02-21 21:54:31', '1', '1', '12', '3', 'seat-79', null, null, null, '35cd807c-659a-41e1-870c-13c7efa183c8', '0', '1', '43');
INSERT INTO `m_order` VALUES ('62', '2019-02-22 11:51:45', '1', '1', '25', '5', 'seat-94', 'seat-95', null, null, 'b7861f32-bde1-4820-8a9e-a3d95aa318ea', '0', '1', '86');
INSERT INTO `m_order` VALUES ('63', '2019-02-22 16:27:51', '1', '4', '120', '9', 'seat-145', 'seat-146', null, null, '89f5bb34-d446-4522-ab28-661a314862d4', '0', '1', '96');
INSERT INTO `m_order` VALUES ('64', '2019-02-25 09:39:31', '1', '1', '1', '1', 'seat-123', null, null, null, '5063ad99-ab9e-41ab-a95d-3f1e5b33852d', '0', '1', '43');
INSERT INTO `m_order` VALUES ('65', '2019-02-25 09:43:20', '1', '1', '7', '2', 'seat-95', 'seat-96', null, null, 'bf50702d-7262-421c-a8f8-c26b88a110ab', '0', '1', '86');
INSERT INTO `m_order` VALUES ('66', '2019-02-25 09:58:52', '1', '10', '82', '2', 'seat-94', 'seat-95', null, null, 'f93b2858-fd8e-4241-b8bb-8b58d868974e', '0', '1', '76');
INSERT INTO `m_order` VALUES ('67', '2019-02-25 10:00:01', '1', '10', '82', '2', 'seat-93', null, null, null, null, '1', '0', '38');
INSERT INTO `m_order` VALUES ('68', '2019-02-25 12:41:51', '10', '1', '6', '2', 'seat-93', 'seat-110', null, null, 'db6de042-c61b-4dd8-a994-b07c720253ba', '0', '1', '86');
INSERT INTO `m_order` VALUES ('69', '2019-02-25 14:05:30', '1', '1', '1', '1', 'seat-163', null, null, null, 'f2cace91-ddc3-4112-8a55-ec3567cdb09b', '1', '1', '43');

-- ----------------------------
-- Table structure for m_seat
-- ----------------------------
DROP TABLE IF EXISTS `m_seat`;
CREATE TABLE `m_seat` (
  `seat_id` int(11) NOT NULL,
  PRIMARY KEY (`seat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_seat
-- ----------------------------
INSERT INTO `m_seat` VALUES ('1');
INSERT INTO `m_seat` VALUES ('2');
INSERT INTO `m_seat` VALUES ('3');
INSERT INTO `m_seat` VALUES ('4');
INSERT INTO `m_seat` VALUES ('5');
INSERT INTO `m_seat` VALUES ('6');
INSERT INTO `m_seat` VALUES ('7');
INSERT INTO `m_seat` VALUES ('8');
INSERT INTO `m_seat` VALUES ('9');
INSERT INTO `m_seat` VALUES ('10');
INSERT INTO `m_seat` VALUES ('11');
INSERT INTO `m_seat` VALUES ('12');
INSERT INTO `m_seat` VALUES ('13');
INSERT INTO `m_seat` VALUES ('14');
INSERT INTO `m_seat` VALUES ('15');
INSERT INTO `m_seat` VALUES ('16');
INSERT INTO `m_seat` VALUES ('17');
INSERT INTO `m_seat` VALUES ('18');
INSERT INTO `m_seat` VALUES ('19');
INSERT INTO `m_seat` VALUES ('20');
INSERT INTO `m_seat` VALUES ('21');
INSERT INTO `m_seat` VALUES ('22');
INSERT INTO `m_seat` VALUES ('23');
INSERT INTO `m_seat` VALUES ('24');
INSERT INTO `m_seat` VALUES ('25');
INSERT INTO `m_seat` VALUES ('26');
INSERT INTO `m_seat` VALUES ('27');
INSERT INTO `m_seat` VALUES ('28');
INSERT INTO `m_seat` VALUES ('29');
INSERT INTO `m_seat` VALUES ('30');
INSERT INTO `m_seat` VALUES ('31');
INSERT INTO `m_seat` VALUES ('32');
INSERT INTO `m_seat` VALUES ('33');
INSERT INTO `m_seat` VALUES ('34');
INSERT INTO `m_seat` VALUES ('35');
INSERT INTO `m_seat` VALUES ('36');
INSERT INTO `m_seat` VALUES ('37');
INSERT INTO `m_seat` VALUES ('38');
INSERT INTO `m_seat` VALUES ('39');
INSERT INTO `m_seat` VALUES ('40');
INSERT INTO `m_seat` VALUES ('41');
INSERT INTO `m_seat` VALUES ('42');
INSERT INTO `m_seat` VALUES ('43');
INSERT INTO `m_seat` VALUES ('44');
INSERT INTO `m_seat` VALUES ('45');
INSERT INTO `m_seat` VALUES ('46');
INSERT INTO `m_seat` VALUES ('47');
INSERT INTO `m_seat` VALUES ('48');
INSERT INTO `m_seat` VALUES ('49');
INSERT INTO `m_seat` VALUES ('50');
INSERT INTO `m_seat` VALUES ('51');
INSERT INTO `m_seat` VALUES ('52');
INSERT INTO `m_seat` VALUES ('53');
INSERT INTO `m_seat` VALUES ('54');
INSERT INTO `m_seat` VALUES ('55');
INSERT INTO `m_seat` VALUES ('56');
INSERT INTO `m_seat` VALUES ('57');
INSERT INTO `m_seat` VALUES ('58');
INSERT INTO `m_seat` VALUES ('59');
INSERT INTO `m_seat` VALUES ('60');
INSERT INTO `m_seat` VALUES ('61');
INSERT INTO `m_seat` VALUES ('62');
INSERT INTO `m_seat` VALUES ('63');
INSERT INTO `m_seat` VALUES ('64');
INSERT INTO `m_seat` VALUES ('65');
INSERT INTO `m_seat` VALUES ('66');
INSERT INTO `m_seat` VALUES ('67');
INSERT INTO `m_seat` VALUES ('68');
INSERT INTO `m_seat` VALUES ('69');
INSERT INTO `m_seat` VALUES ('70');
INSERT INTO `m_seat` VALUES ('71');
INSERT INTO `m_seat` VALUES ('72');
INSERT INTO `m_seat` VALUES ('73');
INSERT INTO `m_seat` VALUES ('74');
INSERT INTO `m_seat` VALUES ('75');
INSERT INTO `m_seat` VALUES ('76');
INSERT INTO `m_seat` VALUES ('77');
INSERT INTO `m_seat` VALUES ('78');
INSERT INTO `m_seat` VALUES ('79');
INSERT INTO `m_seat` VALUES ('80');
INSERT INTO `m_seat` VALUES ('81');
INSERT INTO `m_seat` VALUES ('82');
INSERT INTO `m_seat` VALUES ('83');
INSERT INTO `m_seat` VALUES ('84');
INSERT INTO `m_seat` VALUES ('85');
INSERT INTO `m_seat` VALUES ('86');
INSERT INTO `m_seat` VALUES ('87');
INSERT INTO `m_seat` VALUES ('88');
INSERT INTO `m_seat` VALUES ('89');
INSERT INTO `m_seat` VALUES ('90');
INSERT INTO `m_seat` VALUES ('91');
INSERT INTO `m_seat` VALUES ('92');
INSERT INTO `m_seat` VALUES ('93');
INSERT INTO `m_seat` VALUES ('94');
INSERT INTO `m_seat` VALUES ('95');
INSERT INTO `m_seat` VALUES ('96');
INSERT INTO `m_seat` VALUES ('97');
INSERT INTO `m_seat` VALUES ('98');
INSERT INTO `m_seat` VALUES ('99');
INSERT INTO `m_seat` VALUES ('100');
INSERT INTO `m_seat` VALUES ('101');
INSERT INTO `m_seat` VALUES ('102');
INSERT INTO `m_seat` VALUES ('103');
INSERT INTO `m_seat` VALUES ('104');
INSERT INTO `m_seat` VALUES ('105');
INSERT INTO `m_seat` VALUES ('106');
INSERT INTO `m_seat` VALUES ('107');
INSERT INTO `m_seat` VALUES ('108');
INSERT INTO `m_seat` VALUES ('109');
INSERT INTO `m_seat` VALUES ('110');
INSERT INTO `m_seat` VALUES ('111');
INSERT INTO `m_seat` VALUES ('112');
INSERT INTO `m_seat` VALUES ('113');
INSERT INTO `m_seat` VALUES ('114');
INSERT INTO `m_seat` VALUES ('115');
INSERT INTO `m_seat` VALUES ('116');
INSERT INTO `m_seat` VALUES ('117');
INSERT INTO `m_seat` VALUES ('118');
INSERT INTO `m_seat` VALUES ('119');
INSERT INTO `m_seat` VALUES ('120');
INSERT INTO `m_seat` VALUES ('121');
INSERT INTO `m_seat` VALUES ('122');
INSERT INTO `m_seat` VALUES ('123');
INSERT INTO `m_seat` VALUES ('124');
INSERT INTO `m_seat` VALUES ('125');
INSERT INTO `m_seat` VALUES ('126');
INSERT INTO `m_seat` VALUES ('127');
INSERT INTO `m_seat` VALUES ('128');
INSERT INTO `m_seat` VALUES ('129');
INSERT INTO `m_seat` VALUES ('130');
INSERT INTO `m_seat` VALUES ('131');
INSERT INTO `m_seat` VALUES ('132');
INSERT INTO `m_seat` VALUES ('133');
INSERT INTO `m_seat` VALUES ('134');
INSERT INTO `m_seat` VALUES ('135');
INSERT INTO `m_seat` VALUES ('136');
INSERT INTO `m_seat` VALUES ('137');
INSERT INTO `m_seat` VALUES ('138');
INSERT INTO `m_seat` VALUES ('139');
INSERT INTO `m_seat` VALUES ('140');
INSERT INTO `m_seat` VALUES ('141');
INSERT INTO `m_seat` VALUES ('142');
INSERT INTO `m_seat` VALUES ('143');
INSERT INTO `m_seat` VALUES ('144');
INSERT INTO `m_seat` VALUES ('145');
INSERT INTO `m_seat` VALUES ('146');
INSERT INTO `m_seat` VALUES ('147');
INSERT INTO `m_seat` VALUES ('148');
INSERT INTO `m_seat` VALUES ('149');
INSERT INTO `m_seat` VALUES ('150');
INSERT INTO `m_seat` VALUES ('151');
INSERT INTO `m_seat` VALUES ('152');
INSERT INTO `m_seat` VALUES ('153');
INSERT INTO `m_seat` VALUES ('154');
INSERT INTO `m_seat` VALUES ('155');
INSERT INTO `m_seat` VALUES ('156');
INSERT INTO `m_seat` VALUES ('157');
INSERT INTO `m_seat` VALUES ('158');
INSERT INTO `m_seat` VALUES ('159');
INSERT INTO `m_seat` VALUES ('160');
INSERT INTO `m_seat` VALUES ('161');
INSERT INTO `m_seat` VALUES ('162');
INSERT INTO `m_seat` VALUES ('163');
INSERT INTO `m_seat` VALUES ('164');
INSERT INTO `m_seat` VALUES ('165');
INSERT INTO `m_seat` VALUES ('166');
INSERT INTO `m_seat` VALUES ('167');
INSERT INTO `m_seat` VALUES ('168');
INSERT INTO `m_seat` VALUES ('169');
INSERT INTO `m_seat` VALUES ('170');
INSERT INTO `m_seat` VALUES ('171');
INSERT INTO `m_seat` VALUES ('172');
INSERT INTO `m_seat` VALUES ('173');
INSERT INTO `m_seat` VALUES ('174');
INSERT INTO `m_seat` VALUES ('175');
INSERT INTO `m_seat` VALUES ('176');
INSERT INTO `m_seat` VALUES ('177');
INSERT INTO `m_seat` VALUES ('178');
INSERT INTO `m_seat` VALUES ('179');
INSERT INTO `m_seat` VALUES ('180');
INSERT INTO `m_seat` VALUES ('181');
INSERT INTO `m_seat` VALUES ('182');
INSERT INTO `m_seat` VALUES ('183');
INSERT INTO `m_seat` VALUES ('184');
INSERT INTO `m_seat` VALUES ('185');
INSERT INTO `m_seat` VALUES ('186');
INSERT INTO `m_seat` VALUES ('187');
INSERT INTO `m_seat` VALUES ('188');
INSERT INTO `m_seat` VALUES ('189');
INSERT INTO `m_seat` VALUES ('190');
INSERT INTO `m_seat` VALUES ('191');
INSERT INTO `m_seat` VALUES ('192');
INSERT INTO `m_seat` VALUES ('193');
INSERT INTO `m_seat` VALUES ('194');
INSERT INTO `m_seat` VALUES ('195');
INSERT INTO `m_seat` VALUES ('196');
INSERT INTO `m_seat` VALUES ('197');
INSERT INTO `m_seat` VALUES ('198');
INSERT INTO `m_seat` VALUES ('199');
INSERT INTO `m_seat` VALUES ('200');
INSERT INTO `m_seat` VALUES ('201');
INSERT INTO `m_seat` VALUES ('202');
INSERT INTO `m_seat` VALUES ('203');
INSERT INTO `m_seat` VALUES ('204');

-- ----------------------------
-- Table structure for m_seat_noempty
-- ----------------------------
DROP TABLE IF EXISTS `m_seat_noempty`;
CREATE TABLE `m_seat_noempty` (
  `movie_scene` int(11) DEFAULT NULL,
  `seatid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_seat_noempty
-- ----------------------------
INSERT INTO `m_seat_noempty` VALUES ('1', '115');
INSERT INTO `m_seat_noempty` VALUES ('1', '116');
INSERT INTO `m_seat_noempty` VALUES ('1', '122');
INSERT INTO `m_seat_noempty` VALUES ('1', '92');
INSERT INTO `m_seat_noempty` VALUES ('1', '93');
INSERT INTO `m_seat_noempty` VALUES ('1', '94');
INSERT INTO `m_seat_noempty` VALUES ('1', '96');
INSERT INTO `m_seat_noempty` VALUES ('1', '155');
INSERT INTO `m_seat_noempty` VALUES ('1', '156');
INSERT INTO `m_seat_noempty` VALUES ('1', '143');
INSERT INTO `m_seat_noempty` VALUES ('1', '160');
INSERT INTO `m_seat_noempty` VALUES ('1', '148');
INSERT INTO `m_seat_noempty` VALUES ('1', '165');
INSERT INTO `m_seat_noempty` VALUES ('1', '126');
INSERT INTO `m_seat_noempty` VALUES ('1', '131');
INSERT INTO `m_seat_noempty` VALUES ('1', '203');
INSERT INTO `m_seat_noempty` VALUES ('1', '204');
INSERT INTO `m_seat_noempty` VALUES ('1', '188');
INSERT INTO `m_seat_noempty` VALUES ('1', '189');
INSERT INTO `m_seat_noempty` VALUES ('1', '154');
INSERT INTO `m_seat_noempty` VALUES ('1', '171');
INSERT INTO `m_seat_noempty` VALUES ('1', '201');
INSERT INTO `m_seat_noempty` VALUES ('1', '202');
INSERT INTO `m_seat_noempty` VALUES ('2', '128');
INSERT INTO `m_seat_noempty` VALUES ('2', '129');
INSERT INTO `m_seat_noempty` VALUES ('3', '160');
INSERT INTO `m_seat_noempty` VALUES ('3', '160');
INSERT INTO `m_seat_noempty` VALUES ('3', '94');
INSERT INTO `m_seat_noempty` VALUES ('3', '95');
INSERT INTO `m_seat_noempty` VALUES ('33', '91');
INSERT INTO `m_seat_noempty` VALUES ('33', '109');
INSERT INTO `m_seat_noempty` VALUES ('19', '92');
INSERT INTO `m_seat_noempty` VALUES ('6', '92');
INSERT INTO `m_seat_noempty` VALUES ('6', '109');
INSERT INTO `m_seat_noempty` VALUES ('12', '92');
INSERT INTO `m_seat_noempty` VALUES ('12', '93');
INSERT INTO `m_seat_noempty` VALUES ('6', '111');
INSERT INTO `m_seat_noempty` VALUES ('6', '112');
INSERT INTO `m_seat_noempty` VALUES ('16', '95');
INSERT INTO `m_seat_noempty` VALUES ('16', '96');
INSERT INTO `m_seat_noempty` VALUES ('18', '114');
INSERT INTO `m_seat_noempty` VALUES ('18', '131');
INSERT INTO `m_seat_noempty` VALUES ('31', '111');
INSERT INTO `m_seat_noempty` VALUES ('31', '112');
INSERT INTO `m_seat_noempty` VALUES ('12', '79');
INSERT INTO `m_seat_noempty` VALUES ('25', '94');
INSERT INTO `m_seat_noempty` VALUES ('25', '95');
INSERT INTO `m_seat_noempty` VALUES ('120', '145');
INSERT INTO `m_seat_noempty` VALUES ('120', '146');
INSERT INTO `m_seat_noempty` VALUES ('1', '123');
INSERT INTO `m_seat_noempty` VALUES ('7', '95');
INSERT INTO `m_seat_noempty` VALUES ('7', '96');
INSERT INTO `m_seat_noempty` VALUES ('7', '95');
INSERT INTO `m_seat_noempty` VALUES ('7', '96');
INSERT INTO `m_seat_noempty` VALUES ('82', '94');
INSERT INTO `m_seat_noempty` VALUES ('82', '95');
INSERT INTO `m_seat_noempty` VALUES ('6', '93');
INSERT INTO `m_seat_noempty` VALUES ('6', '110');
INSERT INTO `m_seat_noempty` VALUES ('1', '163');

-- ----------------------------
-- Table structure for m_time
-- ----------------------------
DROP TABLE IF EXISTS `m_time`;
CREATE TABLE `m_time` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(10) NOT NULL COMMENT '所属电影院',
  `movie_id` int(10) DEFAULT NULL,
  `viewing_projection_start` datetime DEFAULT NULL COMMENT '放映时间',
  `viewing_projection_end` datetime DEFAULT NULL,
  `viewing_time` varchar(32) DEFAULT NULL,
  `viewing_language` varchar(32) DEFAULT NULL COMMENT '语言版本',
  `viewing_hall` varchar(64) DEFAULT NULL COMMENT '放映厅',
  `viewing_price` int(12) DEFAULT NULL COMMENT '售价（元）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=143 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_time
-- ----------------------------
INSERT INTO `m_time` VALUES ('1', '1', '1', '2019-02-18 15:00:00', '2019-02-18 17:08:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('2', '1', '1', '2019-02-18 18:40:00', '2019-02-18 20:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('3', '1', '2', '2019-02-18 19:40:00', '2019-02-18 21:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('4', '1', '2', '2019-02-18 20:40:00', '2019-02-18 22:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('5', '1', '3', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('6', '2', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('7', '2', '1', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('8', '2', '2', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('9', '2', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('10', '2', '3', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('11', '2', '3', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('12', '3', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('13', '3', '3', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('14', '3', '4', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '36');
INSERT INTO `m_time` VALUES ('15', '3', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('16', '3', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('17', '3', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('18', '4', '3', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('19', '4', '1', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('20', '4', '5', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '48');
INSERT INTO `m_time` VALUES ('21', '4', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('22', '4', '2', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('23', '4', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('24', '5', '5', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('25', '5', '1', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('26', '5', '2', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('27', '5', '3', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('28', '5', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('29', '5', '6', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('30', '6', '7', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '45');
INSERT INTO `m_time` VALUES ('31', '6', '8', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('32', '6', '3', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('33', '6', '4', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '36');
INSERT INTO `m_time` VALUES ('34', '6', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('35', '6', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('36', '7', '9', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('37', '7', '10', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '33');
INSERT INTO `m_time` VALUES ('38', '7', '9', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('39', '7', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('40', '7', '3', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('41', '7', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('42', '8', '10', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '33');
INSERT INTO `m_time` VALUES ('43', '8', '8', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('44', '8', '8', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('45', '8', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('46', '8', '3', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('47', '8', '1', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('48', '9', '2', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('49', '9', '5', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '48');
INSERT INTO `m_time` VALUES ('50', '9', '3', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('51', '9', '2', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('52', '9', '1', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '43');
INSERT INTO `m_time` VALUES ('53', '9', '6', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('54', '10', '5', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('55', '10', '7', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '45');
INSERT INTO `m_time` VALUES ('56', '10', '8', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('57', '10', '9', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('58', '10', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('59', '10', '7', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '45');
INSERT INTO `m_time` VALUES ('60', '11', '5', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('61', '11', '3', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('62', '11', '8', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('63', '11', '9', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('64', '11', '2', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('65', '11', '4', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '36');
INSERT INTO `m_time` VALUES ('66', '12', '5', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('67', '12', '6', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('68', '12', '7', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '45');
INSERT INTO `m_time` VALUES ('69', '12', '8', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '43');
INSERT INTO `m_time` VALUES ('70', '12', '10', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '33');
INSERT INTO `m_time` VALUES ('71', '12', '8', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('72', '1', '4', '2019-02-18 15:00:00', '2019-02-18 17:08:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('73', '1', '5', '2019-02-18 18:40:00', '2019-02-18 20:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('74', '1', '6', '2019-02-18 19:40:00', '2019-02-18 21:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('75', '1', '7', '2019-02-18 20:40:00', '2019-02-18 22:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('76', '1', '8', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('77', '2', '4', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('78', '2', '6', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('79', '2', '7', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('80', '2', '8', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('81', '2', '9', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('82', '2', '10', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('83', '3', '6', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '43');
INSERT INTO `m_time` VALUES ('84', '3', '7', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('85', '3', '8', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '36');
INSERT INTO `m_time` VALUES ('86', '3', '9', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('87', '3', '10', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('88', '3', '1', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('89', '4', '6', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('90', '4', '7', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('91', '4', '8', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '48');
INSERT INTO `m_time` VALUES ('92', '4', '9', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('93', '4', '10', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('94', '4', '5', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('95', '5', '5', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('96', '5', '1', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('97', '5', '2', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('98', '5', '3', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('99', '5', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('100', '5', '6', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('101', '6', '7', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '45');
INSERT INTO `m_time` VALUES ('102', '6', '8', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('103', '6', '3', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('104', '6', '4', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '36');
INSERT INTO `m_time` VALUES ('105', '6', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('106', '6', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('107', '7', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('108', '7', '4', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '33');
INSERT INTO `m_time` VALUES ('109', '7', '5', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('110', '7', '6', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('111', '7', '7', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('112', '7', '8', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('113', '8', '9', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '33');
INSERT INTO `m_time` VALUES ('114', '8', '7', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('115', '8', '6', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('116', '8', '5', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('117', '8', '4', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('118', '8', '10', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '43');
INSERT INTO `m_time` VALUES ('119', '9', '8', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '38');
INSERT INTO `m_time` VALUES ('120', '9', '4', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '48');
INSERT INTO `m_time` VALUES ('121', '9', '7', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '38');
INSERT INTO `m_time` VALUES ('122', '9', '9', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('123', '9', '8', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '43');
INSERT INTO `m_time` VALUES ('124', '9', '2', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('125', '10', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('126', '10', '2', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '45');
INSERT INTO `m_time` VALUES ('127', '10', '3', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('128', '10', '4', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('129', '10', '10', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '48');
INSERT INTO `m_time` VALUES ('130', '10', '5', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '45');
INSERT INTO `m_time` VALUES ('131', '11', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('132', '11', '5', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '38');
INSERT INTO `m_time` VALUES ('133', '11', '6', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '43');
INSERT INTO `m_time` VALUES ('134', '11', '7', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '38');
INSERT INTO `m_time` VALUES ('135', '11', '10', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '38');
INSERT INTO `m_time` VALUES ('136', '11', '3', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '36');
INSERT INTO `m_time` VALUES ('137', '12', '1', '2019-02-18 15:00:00', '2019-02-18 17:48:00', '126', '国语3D', '1号厅', '48');
INSERT INTO `m_time` VALUES ('138', '12', '2', '2019-02-18 18:40:00', '2019-02-18 19:48:00', '126', '国语3D', '2号厅', '39');
INSERT INTO `m_time` VALUES ('139', '12', '3', '2019-02-18 19:40:00', '2019-02-18 20:48:00', '126', '国语3D', '4号厅', '45');
INSERT INTO `m_time` VALUES ('140', '12', '4', '2019-02-18 20:40:00', '2019-02-18 21:48:00', '126', '国语3D', '3号厅', '43');
INSERT INTO `m_time` VALUES ('141', '12', '5', '2019-02-18 21:40:00', '2019-02-18 22:48:00', '126', '国语3D', '5号厅', '33');
INSERT INTO `m_time` VALUES ('142', '12', '9', '2019-02-18 22:40:00', '2019-02-18 23:48:00', '126', '国语3D', '2号厅', '43');

-- ----------------------------
-- Table structure for m_user
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(32) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `phone` varchar(32) DEFAULT NULL COMMENT '手机',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `gender` varchar(32) DEFAULT '1' COMMENT '性别',
  `birthday` varchar(32) DEFAULT NULL COMMENT '生日',
  `life` varchar(32) DEFAULT '1' COMMENT '生活状态',
  `trade` varchar(32) DEFAULT NULL COMMENT '行业大方向',
  `job` varchar(32) DEFAULT NULL COMMENT '行业小方向',
  `interest` varchar(64) DEFAULT NULL COMMENT '兴趣',
  `signature` varchar(64) DEFAULT NULL COMMENT '个性签名',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐值',
  `is_role` varchar(2) NOT NULL DEFAULT '0' COMMENT '1=管理员，0=客户',
  `image` varchar(128) DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of m_user
-- ----------------------------
INSERT INTO `m_user` VALUES ('1', 'admin', 'e56419914765c6d22dc5018114d73a28', '10086', 'admin@163.com', '1', '2019-2-21', '1', '信息技术', 'IT', '1-3-4-5', '我是管理员', '123456', '1', '/files2019/02/25/09/a5142489-9a6a-4b04-a433-3cbbc0cbff63.jpg');
INSERT INTO `m_user` VALUES ('2', 'lml', '5f1d7a84db00d2fce00b31a7fc73224f', null, null, '1', '2019-4-6', '1', '信息技术', '互联网', '1-2-3-4-8-13', '1havha', '123456', '0', '/files2019/02/21/08/de1b122b-d6d3-4e69-9ed4-459a3731df20.jpg');
INSERT INTO `m_user` VALUES ('3', '7E49F37-2', '5f1d7a84db00d2fce00b31a7fc73224f', '12345678910', null, '1', null, '1', null, null, null, null, '123456', '0', null);
INSERT INTO `m_user` VALUES ('4', '1ED5DAA-6', '48d60bb0f5ba6acdc39621509138724e', '12345678911', null, '1', null, '1', null, null, null, null, '0.b1pjlv2ez8t', '0', null);
INSERT INTO `m_user` VALUES ('5', '7EDF092-3', '609114ca2a03a9189f6870d4dc49cce6', '12306', null, '1', null, '1', null, null, null, null, '0.lq6xkdhbxzc', '0', null);
INSERT INTO `m_user` VALUES ('6', '14521D5-6', '4436cc3c78e1f3e00f5dcc61b4bb6b79', '123456', null, '1', null, '1', null, null, null, null, '0.iertm1gfpbs', '0', null);
INSERT INTO `m_user` VALUES ('7', '2FA6D84-7', 'be2f97d0db00414ab0a073cf2a96fd6b', '13420109325', null, '1', null, '1', null, null, null, null, '0.zrudxk3dkqm', '0', null);
INSERT INTO `m_user` VALUES ('8', '643A765-4', '4ce5591bbcc0d739e9bd3af5f6328c55', '13420107177', null, '1', null, '1', null, null, null, null, '0.6snol6xf7q3', '0', null);
INSERT INTO `m_user` VALUES ('9', 'F9125C4-5', 'da84f5959bc59e871e4f3620b1119d4b', '13322723022', null, '1', null, '1', null, null, null, null, '0.bhka3o862uk', '0', null);
INSERT INTO `m_user` VALUES ('10', '66', '956d8fa41759a40641f6802409caa6c3', '87913079', null, '1', '2016-1-1', '1', '信息技术', '互联网', '1', '666', '0.oei7vyl708a', '0', '/files2019/02/25/12/3ccb94fd-0a8d-4666-b15d-87207644ae41.jpg');
