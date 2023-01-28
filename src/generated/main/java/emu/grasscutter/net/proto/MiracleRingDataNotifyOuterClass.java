// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingDataNotify.proto

public final class MiracleRingDataNotifyOuterClass {
  private MiracleRingDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isGadgetCreated = 2;</code>
     * @return The isGadgetCreated.
     */
    boolean getIsGadgetCreated();

    /**
     * <code>uint32 miracleRingCd = 8;</code>
     * @return The miracleRingCd.
     */
    int getMiracleRingCd();

    /**
     * <code>uint32 lastDeliverItemTime = 4;</code>
     * @return The lastDeliverItemTime.
     */
    int getLastDeliverItemTime();

    /**
     * <code>uint32 lastTakeRewardTime = 13;</code>
     * @return The lastTakeRewardTime.
     */
    int getLastTakeRewardTime();

    /**
     * <code>uint32 gadgetEntityId = 6;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * Protobuf type {@code MiracleRingDataNotify}
   */
  public static final class MiracleRingDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingDataNotify)
      MiracleRingDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingDataNotify.newBuilder() to construct.
    private MiracleRingDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MiracleRingDataNotify(
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
            case 16: {

              isGadgetCreated_ = input.readBool();
              break;
            }
            case 32: {

              lastDeliverItemTime_ = input.readUInt32();
              break;
            }
            case 48: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 64: {

              miracleRingCd_ = input.readUInt32();
              break;
            }
            case 104: {

              lastTakeRewardTime_ = input.readUInt32();
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
      return MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.class, MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MiracleRingDataNotify.DFBKOCIMEPN}
     */
    public enum DFBKOCIMEPN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5246;</code>
       */
      PEPPOHPHJOJ(1, 5246),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DFBKOCIMEPN DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5246;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5246;
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
      public static DFBKOCIMEPN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DFBKOCIMEPN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5246: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DFBKOCIMEPN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DFBKOCIMEPN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DFBKOCIMEPN>() {
              public DFBKOCIMEPN findValueByNumber(int number) {
                return DFBKOCIMEPN.forNumber(number);
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
        return MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final DFBKOCIMEPN[] VALUES = getStaticValuesArray();
      private static DFBKOCIMEPN[] getStaticValuesArray() {
        return new DFBKOCIMEPN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DFBKOCIMEPN valueOf(
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

      private DFBKOCIMEPN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MiracleRingDataNotify.DFBKOCIMEPN)
    }

    public static final int ISGADGETCREATED_FIELD_NUMBER = 2;
    private boolean isGadgetCreated_;
    /**
     * <code>bool isGadgetCreated = 2;</code>
     * @return The isGadgetCreated.
     */
    @java.lang.Override
    public boolean getIsGadgetCreated() {
      return isGadgetCreated_;
    }

    public static final int MIRACLERINGCD_FIELD_NUMBER = 8;
    private int miracleRingCd_;
    /**
     * <code>uint32 miracleRingCd = 8;</code>
     * @return The miracleRingCd.
     */
    @java.lang.Override
    public int getMiracleRingCd() {
      return miracleRingCd_;
    }

    public static final int LASTDELIVERITEMTIME_FIELD_NUMBER = 4;
    private int lastDeliverItemTime_;
    /**
     * <code>uint32 lastDeliverItemTime = 4;</code>
     * @return The lastDeliverItemTime.
     */
    @java.lang.Override
    public int getLastDeliverItemTime() {
      return lastDeliverItemTime_;
    }

    public static final int LASTTAKEREWARDTIME_FIELD_NUMBER = 13;
    private int lastTakeRewardTime_;
    /**
     * <code>uint32 lastTakeRewardTime = 13;</code>
     * @return The lastTakeRewardTime.
     */
    @java.lang.Override
    public int getLastTakeRewardTime() {
      return lastTakeRewardTime_;
    }

    public static final int GADGETENTITYID_FIELD_NUMBER = 6;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadgetEntityId = 6;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (isGadgetCreated_ != false) {
        output.writeBool(2, isGadgetCreated_);
      }
      if (lastDeliverItemTime_ != 0) {
        output.writeUInt32(4, lastDeliverItemTime_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(6, gadgetEntityId_);
      }
      if (miracleRingCd_ != 0) {
        output.writeUInt32(8, miracleRingCd_);
      }
      if (lastTakeRewardTime_ != 0) {
        output.writeUInt32(13, lastTakeRewardTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isGadgetCreated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isGadgetCreated_);
      }
      if (lastDeliverItemTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lastDeliverItemTime_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gadgetEntityId_);
      }
      if (miracleRingCd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, miracleRingCd_);
      }
      if (lastTakeRewardTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, lastTakeRewardTime_);
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
      if (!(obj instanceof MiracleRingDataNotifyOuterClass.MiracleRingDataNotify)) {
        return super.equals(obj);
      }
      MiracleRingDataNotifyOuterClass.MiracleRingDataNotify other = (MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) obj;

      if (getIsGadgetCreated()
          != other.getIsGadgetCreated()) return false;
      if (getMiracleRingCd()
          != other.getMiracleRingCd()) return false;
      if (getLastDeliverItemTime()
          != other.getLastDeliverItemTime()) return false;
      if (getLastTakeRewardTime()
          != other.getLastTakeRewardTime()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + ISGADGETCREATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGadgetCreated());
      hash = (37 * hash) + MIRACLERINGCD_FIELD_NUMBER;
      hash = (53 * hash) + getMiracleRingCd();
      hash = (37 * hash) + LASTDELIVERITEMTIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastDeliverItemTime();
      hash = (37 * hash) + LASTTAKEREWARDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastTakeRewardTime();
      hash = (37 * hash) + GADGETENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
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
    public static Builder newBuilder(MiracleRingDataNotifyOuterClass.MiracleRingDataNotify prototype) {
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
     * Protobuf type {@code MiracleRingDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingDataNotify)
        MiracleRingDataNotifyOuterClass.MiracleRingDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.class, MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.Builder.class);
      }

      // Construct using MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.newBuilder()
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
        isGadgetCreated_ = false;

        miracleRingCd_ = 0;

        lastDeliverItemTime_ = 0;

        lastTakeRewardTime_ = 0;

        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
      }

      @java.lang.Override
      public MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstanceForType() {
        return MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public MiracleRingDataNotifyOuterClass.MiracleRingDataNotify build() {
        MiracleRingDataNotifyOuterClass.MiracleRingDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MiracleRingDataNotifyOuterClass.MiracleRingDataNotify buildPartial() {
        MiracleRingDataNotifyOuterClass.MiracleRingDataNotify result = new MiracleRingDataNotifyOuterClass.MiracleRingDataNotify(this);
        result.isGadgetCreated_ = isGadgetCreated_;
        result.miracleRingCd_ = miracleRingCd_;
        result.lastDeliverItemTime_ = lastDeliverItemTime_;
        result.lastTakeRewardTime_ = lastTakeRewardTime_;
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) {
          return mergeFrom((MiracleRingDataNotifyOuterClass.MiracleRingDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MiracleRingDataNotifyOuterClass.MiracleRingDataNotify other) {
        if (other == MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.getDefaultInstance()) return this;
        if (other.getIsGadgetCreated() != false) {
          setIsGadgetCreated(other.getIsGadgetCreated());
        }
        if (other.getMiracleRingCd() != 0) {
          setMiracleRingCd(other.getMiracleRingCd());
        }
        if (other.getLastDeliverItemTime() != 0) {
          setLastDeliverItemTime(other.getLastDeliverItemTime());
        }
        if (other.getLastTakeRewardTime() != 0) {
          setLastTakeRewardTime(other.getLastTakeRewardTime());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
        MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isGadgetCreated_ ;
      /**
       * <code>bool isGadgetCreated = 2;</code>
       * @return The isGadgetCreated.
       */
      @java.lang.Override
      public boolean getIsGadgetCreated() {
        return isGadgetCreated_;
      }
      /**
       * <code>bool isGadgetCreated = 2;</code>
       * @param value The isGadgetCreated to set.
       * @return This builder for chaining.
       */
      public Builder setIsGadgetCreated(boolean value) {
        
        isGadgetCreated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isGadgetCreated = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGadgetCreated() {
        
        isGadgetCreated_ = false;
        onChanged();
        return this;
      }

      private int miracleRingCd_ ;
      /**
       * <code>uint32 miracleRingCd = 8;</code>
       * @return The miracleRingCd.
       */
      @java.lang.Override
      public int getMiracleRingCd() {
        return miracleRingCd_;
      }
      /**
       * <code>uint32 miracleRingCd = 8;</code>
       * @param value The miracleRingCd to set.
       * @return This builder for chaining.
       */
      public Builder setMiracleRingCd(int value) {
        
        miracleRingCd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 miracleRingCd = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMiracleRingCd() {
        
        miracleRingCd_ = 0;
        onChanged();
        return this;
      }

      private int lastDeliverItemTime_ ;
      /**
       * <code>uint32 lastDeliverItemTime = 4;</code>
       * @return The lastDeliverItemTime.
       */
      @java.lang.Override
      public int getLastDeliverItemTime() {
        return lastDeliverItemTime_;
      }
      /**
       * <code>uint32 lastDeliverItemTime = 4;</code>
       * @param value The lastDeliverItemTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastDeliverItemTime(int value) {
        
        lastDeliverItemTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lastDeliverItemTime = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastDeliverItemTime() {
        
        lastDeliverItemTime_ = 0;
        onChanged();
        return this;
      }

      private int lastTakeRewardTime_ ;
      /**
       * <code>uint32 lastTakeRewardTime = 13;</code>
       * @return The lastTakeRewardTime.
       */
      @java.lang.Override
      public int getLastTakeRewardTime() {
        return lastTakeRewardTime_;
      }
      /**
       * <code>uint32 lastTakeRewardTime = 13;</code>
       * @param value The lastTakeRewardTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastTakeRewardTime(int value) {
        
        lastTakeRewardTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lastTakeRewardTime = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastTakeRewardTime() {
        
        lastTakeRewardTime_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadgetEntityId = 6;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadgetEntityId = 6;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetEntityId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MiracleRingDataNotify)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingDataNotify)
    private static final MiracleRingDataNotifyOuterClass.MiracleRingDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MiracleRingDataNotifyOuterClass.MiracleRingDataNotify();
    }

    public static MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingDataNotify>() {
      @java.lang.Override
      public MiracleRingDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MiracleRingDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MiracleRingDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MiracleRingDataNotify.proto\"\351\001\n\025Miracl" +
      "eRingDataNotify\022\027\n\017isGadgetCreated\030\002 \001(\010" +
      "\022\025\n\rmiracleRingCd\030\010 \001(\r\022\033\n\023lastDeliverIt" +
      "emTime\030\004 \001(\r\022\032\n\022lastTakeRewardTime\030\r \001(\r" +
      "\022\026\n\016gadgetEntityId\030\006 \001(\r\"O\n\013DFBKOCIMEPN\022" +
      "\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\376(\022\017\n\013DCDNILFDF" +
      "LB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MiracleRingDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingDataNotify_descriptor,
        new java.lang.String[] { "IsGadgetCreated", "MiracleRingCd", "LastDeliverItemTime", "LastTakeRewardTime", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
