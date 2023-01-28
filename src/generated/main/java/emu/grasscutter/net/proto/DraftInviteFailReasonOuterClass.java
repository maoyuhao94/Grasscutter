// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftInviteFailReason.proto

public final class DraftInviteFailReasonOuterClass {
  private DraftInviteFailReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DraftInviteFailReason}
   */
  public enum DraftInviteFailReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_UNKNOWN = 0;</code>
     */
    DRAFT_INVITE_FAIL_REASON_UNKNOWN(0),
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN = 1;</code>
     */
    DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN(1),
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN = 2;</code>
     */
    DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN(2),
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET = 3;</code>
     */
    DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET(3),
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET = 4;</code>
     */
    DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET(4),
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET = 5;</code>
     */
    DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DRAFT_INVITE_FAIL_REASON_UNKNOWN = 0;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_UNKNOWN_VALUE = 0;
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN = 1;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN_VALUE = 1;
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN = 2;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN_VALUE = 2;
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET = 3;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET_VALUE = 3;
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET = 4;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET_VALUE = 4;
    /**
     * <code>DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET = 5;</code>
     */
    public static final int DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DraftInviteFailReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DraftInviteFailReason forNumber(int value) {
      switch (value) {
        case 0: return DRAFT_INVITE_FAIL_REASON_UNKNOWN;
        case 1: return DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN;
        case 2: return DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN;
        case 3: return DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET;
        case 4: return DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET;
        case 5: return DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DraftInviteFailReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DraftInviteFailReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DraftInviteFailReason>() {
            public DraftInviteFailReason findValueByNumber(int number) {
              return DraftInviteFailReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return DraftInviteFailReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DraftInviteFailReason[] VALUES = values();

    public static DraftInviteFailReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DraftInviteFailReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DraftInviteFailReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033DraftInviteFailReason.proto*\256\002\n\025DraftI" +
      "nviteFailReason\022$\n DRAFT_INVITE_FAIL_REA" +
      "SON_UNKNOWN\020\000\022.\n*DRAFT_INVITE_FAIL_REASO" +
      "N_ACTIVITY_NOT_OPEN\020\001\0223\n/DRAFT_INVITE_FA" +
      "IL_REASON_ACTIVITY_PLAY_NOT_OPEN\020\002\022+\n\'DR" +
      "AFT_INVITE_FAIL_REASON_SCENE_NOT_MEET\020\003\022" +
      "+\n\'DRAFT_INVITE_FAIL_REASON_WORLD_NOT_ME" +
      "ET\020\004\0220\n,DRAFT_INVITE_FAIL_REASON_PLAY_LI" +
      "MIT_NOT_MEET\020\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
