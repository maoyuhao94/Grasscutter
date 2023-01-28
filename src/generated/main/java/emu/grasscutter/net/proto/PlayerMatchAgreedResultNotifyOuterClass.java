// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerMatchAgreedResultNotify.proto

public final class PlayerMatchAgreedResultNotifyOuterClass {
  private PlayerMatchAgreedResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerMatchAgreedResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerMatchAgreedResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Reason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Reason reason = 5;</code>
     * @return The reason.
     */
    ReasonOuterClass.Reason getReason();

    /**
     * <code>.MatchType matchType = 12;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType matchType = 12;</code>
     * @return The matchType.
     */
    MatchTypeOuterClass.MatchType getMatchType();

    /**
     * <code>uint32 targetUid = 7;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * Protobuf type {@code PlayerMatchAgreedResultNotify}
   */
  public static final class PlayerMatchAgreedResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerMatchAgreedResultNotify)
      PlayerMatchAgreedResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerMatchAgreedResultNotify.newBuilder() to construct.
    private PlayerMatchAgreedResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerMatchAgreedResultNotify() {
      reason_ = 0;
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerMatchAgreedResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerMatchAgreedResultNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 56: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              matchType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.class, PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerMatchAgreedResultNotify.KDDMDKGHIHK}
     */
    public enum KDDMDKGHIHK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4152;</code>
       */
      PEPPOHPHJOJ(1, 4152),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final KDDMDKGHIHK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4152;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4152;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static KDDMDKGHIHK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static KDDMDKGHIHK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4152: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<KDDMDKGHIHK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          KDDMDKGHIHK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<KDDMDKGHIHK>() {
              public KDDMDKGHIHK findValueByNumber(int number) {
                return KDDMDKGHIHK.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final KDDMDKGHIHK[] VALUES = getStaticValuesArray();
      private static KDDMDKGHIHK[] getStaticValuesArray() {
        return new KDDMDKGHIHK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static KDDMDKGHIHK valueOf(
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

      private final int index;
      private final int value;

      private KDDMDKGHIHK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerMatchAgreedResultNotify.KDDMDKGHIHK)
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.Reason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Reason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public ReasonOuterClass.Reason getReason() {
      @SuppressWarnings("deprecation")
      ReasonOuterClass.Reason result = ReasonOuterClass.Reason.valueOf(reason_);
      return result == null ? ReasonOuterClass.Reason.UNRECOGNIZED : result;
    }

    public static final int MATCHTYPE_FIELD_NUMBER = 12;
    private int matchType_;
    /**
     * <code>.MatchType matchType = 12;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType matchType = 12;</code>
     * @return The matchType.
     */
    @java.lang.Override public MatchTypeOuterClass.MatchType getMatchType() {
      @SuppressWarnings("deprecation")
      MatchTypeOuterClass.MatchType result = MatchTypeOuterClass.MatchType.valueOf(matchType_);
      return result == null ? MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
    }

    public static final int TARGETUID_FIELD_NUMBER = 7;
    private int targetUid_;
    /**
     * <code>uint32 targetUid = 7;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (reason_ != ReasonOuterClass.Reason.REASON_SUCC.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(7, targetUid_);
      }
      if (matchType_ != MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(12, matchType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != ReasonOuterClass.Reason.REASON_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, targetUid_);
      }
      if (matchType_ != MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, matchType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify)) {
        return super.equals(obj);
      }
      PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify other = (PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) obj;

      if (reason_ != other.reason_) return false;
      if (matchType_ != other.matchType_) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + MATCHTYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (37 * hash) + TARGETUID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerMatchAgreedResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerMatchAgreedResultNotify)
        PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.class, PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.Builder.class);
      }

      // Construct using PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        matchType_ = 0;

        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlayerMatchAgreedResultNotifyOuterClass.internal_static_PlayerMatchAgreedResultNotify_descriptor;
      }

      @java.lang.Override
      public PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstanceForType() {
        return PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify build() {
        PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify buildPartial() {
        PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify result = new PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify(this);
        result.reason_ = reason_;
        result.matchType_ = matchType_;
        result.targetUid_ = targetUid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) {
          return mergeFrom((PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify other) {
        if (other == PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Reason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Reason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Reason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public ReasonOuterClass.Reason getReason() {
        @SuppressWarnings("deprecation")
        ReasonOuterClass.Reason result = ReasonOuterClass.Reason.valueOf(reason_);
        return result == null ? ReasonOuterClass.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.Reason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(ReasonOuterClass.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Reason reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int matchType_ = 0;
      /**
       * <code>.MatchType matchType = 12;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType matchType = 12;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        
        matchType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType matchType = 12;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public MatchTypeOuterClass.MatchType getMatchType() {
        @SuppressWarnings("deprecation")
        MatchTypeOuterClass.MatchType result = MatchTypeOuterClass.MatchType.valueOf(matchType_);
        return result == null ? MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType matchType = 12;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType matchType = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        
        matchType_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 targetUid = 7;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 targetUid = 7;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetUid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerMatchAgreedResultNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerMatchAgreedResultNotify)
    private static final PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify();
    }

    public static PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerMatchAgreedResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerMatchAgreedResultNotify>() {
      @java.lang.Override
      public PlayerMatchAgreedResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerMatchAgreedResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerMatchAgreedResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerMatchAgreedResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PlayerMatchAgreedResultNotifyOuterClass.PlayerMatchAgreedResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerMatchAgreedResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#PlayerMatchAgreedResultNotify.proto\032\014R" +
      "eason.proto\032\017MatchType.proto\"\273\001\n\035PlayerM" +
      "atchAgreedResultNotify\022\027\n\006reason\030\005 \001(\0162\007" +
      ".Reason\022\035\n\tmatchType\030\014 \001(\0162\n.MatchType\022\021" +
      "\n\ttargetUid\030\007 \001(\r\"O\n\013KDDMDKGHIHK\022\010\n\004NONE" +
      "\020\000\022\020\n\013PEPPOHPHJOJ\020\270 \022\017\n\013DCDNILFDFLB\020\000\022\017\n" +
      "\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ReasonOuterClass.getDescriptor(),
          MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerMatchAgreedResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerMatchAgreedResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerMatchAgreedResultNotify_descriptor,
        new java.lang.String[] { "Reason", "MatchType", "TargetUid", });
    ReasonOuterClass.getDescriptor();
    MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
