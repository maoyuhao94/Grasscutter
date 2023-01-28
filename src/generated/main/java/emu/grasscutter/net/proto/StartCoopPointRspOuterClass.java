// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartCoopPointRsp.proto

public final class StartCoopPointRspOuterClass {
  private StartCoopPointRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartCoopPointRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartCoopPointRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool isStart = 5;</code>
     * @return The isStart.
     */
    boolean getIsStart();

    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     * @return Whether the startMainCoop field is set.
     */
    boolean hasStartMainCoop();
    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     * @return The startMainCoop.
     */
    MainCoopOuterClass.MainCoop getStartMainCoop();
    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     */
    MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder();

    /**
     * <code>uint32 coopPoint = 13;</code>
     * @return The coopPoint.
     */
    int getCoopPoint();
  }
  /**
   * Protobuf type {@code StartCoopPointRsp}
   */
  public static final class StartCoopPointRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartCoopPointRsp)
      StartCoopPointRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartCoopPointRsp.newBuilder() to construct.
    private StartCoopPointRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartCoopPointRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartCoopPointRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartCoopPointRsp(
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

              isStart_ = input.readBool();
              break;
            }
            case 58: {
              MainCoopOuterClass.MainCoop.Builder subBuilder = null;
              if (startMainCoop_ != null) {
                subBuilder = startMainCoop_.toBuilder();
              }
              startMainCoop_ = input.readMessage(MainCoopOuterClass.MainCoop.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startMainCoop_);
                startMainCoop_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              coopPoint_ = input.readUInt32();
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
      return StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StartCoopPointRspOuterClass.StartCoopPointRsp.class, StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code StartCoopPointRsp.FHHNHADMJNM}
     */
    public enum FHHNHADMJNM
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1992;</code>
       */
      PEPPOHPHJOJ(1, 1992),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FHHNHADMJNM DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1992;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1992;
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
      public static FHHNHADMJNM valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FHHNHADMJNM forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1992: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FHHNHADMJNM>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FHHNHADMJNM> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FHHNHADMJNM>() {
              public FHHNHADMJNM findValueByNumber(int number) {
                return FHHNHADMJNM.forNumber(number);
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
        return StartCoopPointRspOuterClass.StartCoopPointRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final FHHNHADMJNM[] VALUES = getStaticValuesArray();
      private static FHHNHADMJNM[] getStaticValuesArray() {
        return new FHHNHADMJNM[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FHHNHADMJNM valueOf(
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

      private FHHNHADMJNM(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:StartCoopPointRsp.FHHNHADMJNM)
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ISSTART_FIELD_NUMBER = 5;
    private boolean isStart_;
    /**
     * <code>bool isStart = 5;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
    }

    public static final int STARTMAINCOOP_FIELD_NUMBER = 7;
    private MainCoopOuterClass.MainCoop startMainCoop_;
    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     * @return Whether the startMainCoop field is set.
     */
    @java.lang.Override
    public boolean hasStartMainCoop() {
      return startMainCoop_ != null;
    }
    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     * @return The startMainCoop.
     */
    @java.lang.Override
    public MainCoopOuterClass.MainCoop getStartMainCoop() {
      return startMainCoop_ == null ? MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
    }
    /**
     * <code>.MainCoop startMainCoop = 7;</code>
     */
    @java.lang.Override
    public MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
      return getStartMainCoop();
    }

    public static final int COOPPOINT_FIELD_NUMBER = 13;
    private int coopPoint_;
    /**
     * <code>uint32 coopPoint = 13;</code>
     * @return The coopPoint.
     */
    @java.lang.Override
    public int getCoopPoint() {
      return coopPoint_;
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
      if (isStart_ != false) {
        output.writeBool(5, isStart_);
      }
      if (startMainCoop_ != null) {
        output.writeMessage(7, getStartMainCoop());
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (coopPoint_ != 0) {
        output.writeUInt32(13, coopPoint_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isStart_);
      }
      if (startMainCoop_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getStartMainCoop());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (coopPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, coopPoint_);
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
      if (!(obj instanceof StartCoopPointRspOuterClass.StartCoopPointRsp)) {
        return super.equals(obj);
      }
      StartCoopPointRspOuterClass.StartCoopPointRsp other = (StartCoopPointRspOuterClass.StartCoopPointRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsStart()
          != other.getIsStart()) return false;
      if (hasStartMainCoop() != other.hasStartMainCoop()) return false;
      if (hasStartMainCoop()) {
        if (!getStartMainCoop()
            .equals(other.getStartMainCoop())) return false;
      }
      if (getCoopPoint()
          != other.getCoopPoint()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ISSTART_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      if (hasStartMainCoop()) {
        hash = (37 * hash) + STARTMAINCOOP_FIELD_NUMBER;
        hash = (53 * hash) + getStartMainCoop().hashCode();
      }
      hash = (37 * hash) + COOPPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getCoopPoint();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
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
    public static Builder newBuilder(StartCoopPointRspOuterClass.StartCoopPointRsp prototype) {
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
     * Protobuf type {@code StartCoopPointRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartCoopPointRsp)
        StartCoopPointRspOuterClass.StartCoopPointRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StartCoopPointRspOuterClass.StartCoopPointRsp.class, StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
      }

      // Construct using StartCoopPointRspOuterClass.StartCoopPointRsp.newBuilder()
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
        retcode_ = 0;

        isStart_ = false;

        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }
        coopPoint_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      public StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
        return StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance();
      }

      @java.lang.Override
      public StartCoopPointRspOuterClass.StartCoopPointRsp build() {
        StartCoopPointRspOuterClass.StartCoopPointRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public StartCoopPointRspOuterClass.StartCoopPointRsp buildPartial() {
        StartCoopPointRspOuterClass.StartCoopPointRsp result = new StartCoopPointRspOuterClass.StartCoopPointRsp(this);
        result.retcode_ = retcode_;
        result.isStart_ = isStart_;
        if (startMainCoopBuilder_ == null) {
          result.startMainCoop_ = startMainCoop_;
        } else {
          result.startMainCoop_ = startMainCoopBuilder_.build();
        }
        result.coopPoint_ = coopPoint_;
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
        if (other instanceof StartCoopPointRspOuterClass.StartCoopPointRsp) {
          return mergeFrom((StartCoopPointRspOuterClass.StartCoopPointRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StartCoopPointRspOuterClass.StartCoopPointRsp other) {
        if (other == StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
        }
        if (other.hasStartMainCoop()) {
          mergeStartMainCoop(other.getStartMainCoop());
        }
        if (other.getCoopPoint() != 0) {
          setCoopPoint(other.getCoopPoint());
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
        StartCoopPointRspOuterClass.StartCoopPointRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StartCoopPointRspOuterClass.StartCoopPointRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isStart_ ;
      /**
       * <code>bool isStart = 5;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool isStart = 5;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isStart = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
        onChanged();
        return this;
      }

      private MainCoopOuterClass.MainCoop startMainCoop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          MainCoopOuterClass.MainCoop, MainCoopOuterClass.MainCoop.Builder, MainCoopOuterClass.MainCoopOrBuilder> startMainCoopBuilder_;
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       * @return Whether the startMainCoop field is set.
       */
      public boolean hasStartMainCoop() {
        return startMainCoopBuilder_ != null || startMainCoop_ != null;
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       * @return The startMainCoop.
       */
      public MainCoopOuterClass.MainCoop getStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          return startMainCoop_ == null ? MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        } else {
          return startMainCoopBuilder_.getMessage();
        }
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public Builder setStartMainCoop(MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startMainCoop_ = value;
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public Builder setStartMainCoop(
          MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = builderForValue.build();
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public Builder mergeStartMainCoop(MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (startMainCoop_ != null) {
            startMainCoop_ =
              MainCoopOuterClass.MainCoop.newBuilder(startMainCoop_).mergeFrom(value).buildPartial();
          } else {
            startMainCoop_ = value;
          }
          onChanged();
        } else {
          startMainCoopBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public Builder clearStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
          onChanged();
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public MainCoopOuterClass.MainCoop.Builder getStartMainCoopBuilder() {
        
        onChanged();
        return getStartMainCoopFieldBuilder().getBuilder();
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      public MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
        if (startMainCoopBuilder_ != null) {
          return startMainCoopBuilder_.getMessageOrBuilder();
        } else {
          return startMainCoop_ == null ?
              MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        }
      }
      /**
       * <code>.MainCoop startMainCoop = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          MainCoopOuterClass.MainCoop, MainCoopOuterClass.MainCoop.Builder, MainCoopOuterClass.MainCoopOrBuilder> 
          getStartMainCoopFieldBuilder() {
        if (startMainCoopBuilder_ == null) {
          startMainCoopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              MainCoopOuterClass.MainCoop, MainCoopOuterClass.MainCoop.Builder, MainCoopOuterClass.MainCoopOrBuilder>(
                  getStartMainCoop(),
                  getParentForChildren(),
                  isClean());
          startMainCoop_ = null;
        }
        return startMainCoopBuilder_;
      }

      private int coopPoint_ ;
      /**
       * <code>uint32 coopPoint = 13;</code>
       * @return The coopPoint.
       */
      @java.lang.Override
      public int getCoopPoint() {
        return coopPoint_;
      }
      /**
       * <code>uint32 coopPoint = 13;</code>
       * @param value The coopPoint to set.
       * @return This builder for chaining.
       */
      public Builder setCoopPoint(int value) {
        
        coopPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coopPoint = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoopPoint() {
        
        coopPoint_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartCoopPointRsp)
    }

    // @@protoc_insertion_point(class_scope:StartCoopPointRsp)
    private static final StartCoopPointRspOuterClass.StartCoopPointRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StartCoopPointRspOuterClass.StartCoopPointRsp();
    }

    public static StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartCoopPointRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartCoopPointRsp>() {
      @java.lang.Override
      public StartCoopPointRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartCoopPointRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartCoopPointRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartCoopPointRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartCoopPointRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartCoopPointRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027StartCoopPointRsp.proto\032\016MainCoop.prot" +
      "o\"\273\001\n\021StartCoopPointRsp\022\017\n\007retcode\030\n \001(\005" +
      "\022\017\n\007isStart\030\005 \001(\010\022 \n\rstartMainCoop\030\007 \001(\013" +
      "2\t.MainCoop\022\021\n\tcoopPoint\030\r \001(\r\"O\n\013FHHNHA" +
      "DMJNM\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\310\017\022\017\n\013DCD" +
      "NILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MainCoopOuterClass.getDescriptor(),
        });
    internal_static_StartCoopPointRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartCoopPointRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartCoopPointRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsStart", "StartMainCoop", "CoopPoint", });
    MainCoopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
