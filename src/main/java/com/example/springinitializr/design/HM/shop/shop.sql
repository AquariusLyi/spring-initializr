/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50719
Source Host           : 127.0.0.1:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2020-07-04 19:12:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `id` varchar(60) NOT NULL COMMENT '主键ID',
  `username` varchar(20) DEFAULT NULL COMMENT '所属用户',
  `money` int(7) NOT NULL COMMENT '抵现金额',
  `status` int(1) DEFAULT NULL COMMENT '1有效，2无效',
  `usetime` datetime DEFAULT NULL COMMENT '使用时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coupons
-- ----------------------------
INSERT INTO `coupons` VALUES ('1', 'wangwu', '2', '2', '2020-06-14 16:16:21');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` varchar(60) NOT NULL COMMENT '商品ID',
  `name` varchar(100) DEFAULT NULL COMMENT '商品名字',
  `description` varchar(1000) DEFAULT NULL COMMENT '描述',
  `images` varchar(200) DEFAULT NULL,
  `video` varchar(200) DEFAULT NULL,
  `count` int(5) DEFAULT NULL COMMENT '库存数量',
  `price` int(7) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', '华为Mate 40 Pro', '华为Mate 40 Pro促销价', 'http://1.jpg', 'http://1.mp4', '71', '150');

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` varchar(60) NOT NULL COMMENT '主键',
  `money` int(7) NOT NULL COMMENT '总金额',
  `paymoney` int(7) NOT NULL COMMENT '支付金额',
  `status` int(1) NOT NULL COMMENT '状态：0未支付，1已支付，2申请取消订单，3订单已取消，4订单完成',
  `item_id` varchar(60) DEFAULT NULL COMMENT '商品ID',
  `num` int(2) DEFAULT NULL COMMENT '购买数量',
  `username` varchar(60) DEFAULT NULL COMMENT '用户名',
  `couponsId` varchar(60) DEFAULT NULL COMMENT '优惠券ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('1', '150', '70', '1', '1', '1', 'zhangsan', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(60) NOT NULL COMMENT '密码',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `level` int(1) DEFAULT NULL COMMENT '金币，1金币=1元',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('wangwu', '123456', '男', 'ROLE_USER', '3');
INSERT INTO `user` VALUES ('zhangsan', '123456', '男', 'ROLE_USER', '3');
