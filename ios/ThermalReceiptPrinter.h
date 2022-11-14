
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNThermalReceiptPrinterSpec.h"

@interface ThermalReceiptPrinter : NSObject <NativeThermalReceiptPrinterSpec>
#else
#import <React/RCTBridgeModule.h>

@interface ThermalReceiptPrinter : NSObject <RCTBridgeModule>
#endif

@end
