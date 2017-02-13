// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.2 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/renjunyi/MTT.jce'
// **********************************************************************

#import "JceObjectV2.h"

enum {
    MttImageQuality_QUALITY_NONE,
    MttImageQuality_QUALITY_MINI,
    MttImageQuality_QUALITY_LOW,
    MttImageQuality_QUALITY_STANDARD,
    MttImageQuality_QUALITY_HIGH,
    MttImageQuality_QUALITY_SUPER,
    MttImageQuality_QUALITY_ORIGIN
};
#define MttImageQuality NSInteger

#if JCEV2_ENUM_ETOS_AND_STOE_SUPPORTED

@interface MttImageQualityHelper: JceEnumHelper

+ (NSString *)etos:(MttImageQuality)e;
+ (MttImageQuality)stoe:(NSString *)s;

@end

#endif