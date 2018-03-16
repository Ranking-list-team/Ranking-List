/*
Navicat MySQL Data Transfer

Source Server         : test2
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : proj

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-03-16 01:20:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blogarticle
-- ----------------------------
DROP TABLE IF EXISTS `blogarticle`;
CREATE TABLE `blogarticle` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `microblogID` bigint(20) DEFAULT NULL,
  `comments` bigint(20) DEFAULT NULL,
  `forward` bigint(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `likes` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `blg_art_ref` (`microblogID`),
  CONSTRAINT `blg_art_ref` FOREIGN KEY (`microblogID`) REFERENCES `microblog` (`innerID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blogarticle
-- ----------------------------
INSERT INTO `blogarticle` VALUES ('4', '9', '200', null, '2018-03-14 10:36:13', null);
INSERT INTO `blogarticle` VALUES ('5', '10', '200', null, '2018-03-14 13:40:54', null);
INSERT INTO `blogarticle` VALUES ('6', '11', '200', null, '2018-03-14 13:47:31', null);

-- ----------------------------
-- Table structure for microblog
-- ----------------------------
DROP TABLE IF EXISTS `microblog`;
CREATE TABLE `microblog` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `microblogID` varchar(32) DEFAULT NULL,
  `follower` bigint(20) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `blog_ref` (`microblogID`),
  KEY `ref1` (`userID`),
  CONSTRAINT `ref1` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of microblog
-- ----------------------------
INSERT INTO `microblog` VALUES ('4', 'linlin', null, '15');
INSERT INTO `microblog` VALUES ('6', 'peipei', null, '17');
INSERT INTO `microblog` VALUES ('9', 'bbb', null, '20');
INSERT INTO `microblog` VALUES ('10', 'fff', null, '21');
INSERT INTO `microblog` VALUES ('11', 'rrr', null, '22');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userID` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('15', 'peilin', '660216');
INSERT INTO `users` VALUES ('17', 'yinuo', '980723');
INSERT INTO `users` VALUES ('20', 'aaa', '111');
INSERT INTO `users` VALUES ('21', 'ddd', '222');
INSERT INTO `users` VALUES ('22', 'ttt', '333');

-- ----------------------------
-- Table structure for wechat
-- ----------------------------
DROP TABLE IF EXISTS `wechat`;
CREATE TABLE `wechat` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `officialAccountID` varchar(32) DEFAULT NULL,
  `suscriber` bigint(20) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `ofa_ref` (`officialAccountID`),
  KEY `ref2` (`userID`),
  CONSTRAINT `ref2` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechat
-- ----------------------------
INSERT INTO `wechat` VALUES ('1', 'jiaoda', null, '15');
INSERT INTO `wechat` VALUES ('2', 'software', null, '17');
INSERT INTO `wechat` VALUES ('3', 'ccc', null, '20');
INSERT INTO `wechat` VALUES ('4', 'ggg', null, '21');
INSERT INTO `wechat` VALUES ('5', 'eee', null, '22');

-- ----------------------------
-- Table structure for wechatarticle
-- ----------------------------
DROP TABLE IF EXISTS `wechatarticle`;
CREATE TABLE `wechatarticle` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `wechatID` bigint(32) DEFAULT NULL,
  `views` bigint(20) DEFAULT NULL,
  `likes` bigint(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `comments` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `ref_wh` (`wechatID`),
  CONSTRAINT `ref_wh` FOREIGN KEY (`wechatID`) REFERENCES `wechat` (`innerID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wechatarticle
-- ----------------------------
INSERT INTO `wechatarticle` VALUES ('1', '4', null, '600', '2018-03-14 13:40:54', null);
INSERT INTO `wechatarticle` VALUES ('2', '5', null, '600', '2018-03-14 13:47:31', null);

-- ----------------------------
-- Table structure for zhihu
-- ----------------------------
DROP TABLE IF EXISTS `zhihu`;
CREATE TABLE `zhihu` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `zhihuID` varchar(32) DEFAULT NULL,
  `follower` bigint(20) DEFAULT NULL,
  `answers` bigint(20) DEFAULT NULL,
  `userID` bigint(20) DEFAULT NULL,
  `articles` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `zh_ref` (`zhihuID`),
  KEY `ref3` (`userID`),
  CONSTRAINT `ref3` FOREIGN KEY (`userID`) REFERENCES `users` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zhihu
-- ----------------------------
INSERT INTO `zhihu` VALUES ('1', 'nuonuo', null, null, '15', null);
INSERT INTO `zhihu` VALUES ('2', 'anuo', null, null, '17', null);
INSERT INTO `zhihu` VALUES ('3', 'ddd', null, null, '20', null);
INSERT INTO `zhihu` VALUES ('4', 'hhh', null, null, '21', null);
INSERT INTO `zhihu` VALUES ('5', 'qqq', null, null, '22', null);

-- ----------------------------
-- Table structure for zhihuarticle
-- ----------------------------
DROP TABLE IF EXISTS `zhihuarticle`;
CREATE TABLE `zhihuarticle` (
  `innerID` bigint(20) NOT NULL AUTO_INCREMENT,
  `zhihuID` bigint(20) DEFAULT NULL,
  `likes` bigint(20) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `comments` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`innerID`),
  KEY `ref_zh` (`zhihuID`),
  CONSTRAINT `ref_zh` FOREIGN KEY (`zhihuID`) REFERENCES `zhihu` (`innerID`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zhihuarticle
-- ----------------------------
INSERT INTO `zhihuarticle` VALUES ('1', '5', '88', '2018-03-14 13:47:31', null);
