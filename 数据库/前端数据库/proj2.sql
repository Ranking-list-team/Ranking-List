/*
Navicat MySQL Data Transfer

Source Server         : test2
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : proj2

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-03-16 01:17:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article_score
-- ----------------------------
DROP TABLE IF EXISTS `article_score`;
CREATE TABLE `article_score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL,
  `sourceId` int(11) DEFAULT NULL,
  `sourceName` varchar(255) DEFAULT NULL,
  `articleName` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `forward` bigint(20) DEFAULT NULL,
  `likes` bigint(20) DEFAULT NULL,
  `comments` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_score
-- ----------------------------
INSERT INTO `article_score` VALUES ('1', '1020', '1', 'beibei', 'beibei', '100', '2018-03-15 00:00:00', '100', '100', '100');

-- ----------------------------
-- Table structure for platform_score
-- ----------------------------
DROP TABLE IF EXISTS `platform_score`;
CREATE TABLE `platform_score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL,
  `sourceId` int(11) DEFAULT NULL,
  `sourceName` varchar(255) DEFAULT NULL,
  `score` bigint(20) DEFAULT NULL,
  `time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='source指分数的类别id ： 如微博是1，微信是2，知乎是3';

-- ----------------------------
-- Records of platform_score
-- ----------------------------
INSERT INTO `platform_score` VALUES ('1', '1020', '1', 'spring-boot', '100', '2018-03-15');
INSERT INTO `platform_score` VALUES ('2', '1021', '2', 'springMVC', '100', '2018-03-01');
INSERT INTO `platform_score` VALUES ('3', '1022', '3', 'springData', '100', '2018-03-12');

-- ----------------------------
-- Table structure for score_rule
-- ----------------------------
DROP TABLE IF EXISTS `score_rule`;
CREATE TABLE `score_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemName` varchar(255) DEFAULT NULL,
  `portion` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='这个表可以暂时不投入使用';

-- ----------------------------
-- Records of score_rule
-- ----------------------------

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sourceName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES ('1', 'microblog');
INSERT INTO `source` VALUES ('2', 'wechat');
INSERT INTO `source` VALUES ('3', 'zhihu');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用于登录';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'duyinuo', 'yangyang');

-- ----------------------------
-- Table structure for user_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL,
  `microblogId` varchar(255) DEFAULT NULL,
  `wechatId` varchar(255) DEFAULT NULL,
  `zhihuId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用于具体信息查询';

-- ----------------------------
-- Records of user_detail
-- ----------------------------
INSERT INTO `user_detail` VALUES ('1', '1020', 'spring-boot', 'spring-boot', 'spring-boot');

-- ----------------------------
-- Table structure for user_source
-- ----------------------------
DROP TABLE IF EXISTS `user_source`;
CREATE TABLE `user_source` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL,
  `sourceId` int(11) DEFAULT NULL,
  `signUpDate` datetime DEFAULT NULL,
  `fans` bigint(20) DEFAULT NULL,
  `articles` bigint(20) DEFAULT NULL,
  `likes` bigint(20) DEFAULT NULL,
  `forward` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_source
-- ----------------------------
