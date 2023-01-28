// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DuelHeartSettleNotify.proto

public final class DuelHeartSettleNotifyOuterClass {
  private DuelHeartSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DuelHeartSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DuelHeartSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isNewRecord = 4;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool isSucc = 5;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>uint32 costTime = 1;</code>
     * @return The costTime.
     */
    int getCostTime();
  }
  /**
   * Protobuf type {@code DuelHeartSettleNotify}
   */
  public static final class DuelHeartSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DuelHeartSettleNotify)
      DuelHeartSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DuelHeartSettleNotify.newBuilder() to construct.
    private DuelHeartSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DuelHeartSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DuelHeartSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DuelHeartSettleNotify(
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
            case 8: {

              costTime_ = input.readUInt32();
              break;
            }
            case 32: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 40: {

              isSucc_ = input.readBool();
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
      return DuelHeartSettleNotifyOuterClass.internal_static_DuelHeartSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DuelHeartSettleNotifyOuterClass.internal_static_DuelHeartSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.class, DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code DuelHeartSettleNotify.DCPKPJOKOHK}
     */
    public enum DCPKPJOKOHK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 20655;</code>
       */
      PEPPOHPHJOJ(1, 20655),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DCPKPJOKOHK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 20655;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 20655;
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
      public static DCPKPJOKOHK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DCPKPJOKOHK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 20655: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DCPKPJOKOHK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DCPKPJOKOHK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DCPKPJOKOHK>() {
              public DCPKPJOKOHK findValueByNumber(int number) {
                return DCPKPJOKOHK.forNumber(number);
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
        return DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final DCPKPJOKOHK[] VALUES = getStaticValuesArray();
      private static DCPKPJOKOHK[] getStaticValuesArray() {
        return new DCPKPJOKOHK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DCPKPJOKOHK valueOf(
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

      private DCPKPJOKOHK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DuelHeartSettleNotify.DCPKPJOKOHK)
    }

    public static final int ISNEWRECORD_FIELD_NUMBER = 4;
    private boolean isNewRecord_;
    /**
     * <code>bool isNewRecord = 4;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int ISSUCC_FIELD_NUMBER = 5;
    private boolean isSucc_;
    /**
     * <code>bool isSucc = 5;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int COSTTIME_FIELD_NUMBER = 1;
    private int costTime_;
    /**
     * <code>uint32 costTime = 1;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
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
      if (costTime_ != 0) {
        output.writeUInt32(1, costTime_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(4, isNewRecord_);
      }
      if (isSucc_ != false) {
        output.writeBool(5, isSucc_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, costTime_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNewRecord_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isSucc_);
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
      if (!(obj instanceof DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify)) {
        return super.equals(obj);
      }
      DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify other = (DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (getCostTime()
          != other.getCostTime()) return false;
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
      hash = (37 * hash) + ISNEWRECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + ISSUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + COSTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parseFrom(
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
    public static Builder newBuilder(DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify prototype) {
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
     * Protobuf type {@code DuelHeartSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DuelHeartSettleNotify)
        DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DuelHeartSettleNotifyOuterClass.internal_static_DuelHeartSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DuelHeartSettleNotifyOuterClass.internal_static_DuelHeartSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.class, DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.Builder.class);
      }

      // Construct using DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.newBuilder()
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
        isNewRecord_ = false;

        isSucc_ = false;

        costTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DuelHeartSettleNotifyOuterClass.internal_static_DuelHeartSettleNotify_descriptor;
      }

      @java.lang.Override
      public DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify getDefaultInstanceForType() {
        return DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify build() {
        DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify buildPartial() {
        DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify result = new DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify(this);
        result.isNewRecord_ = isNewRecord_;
        result.isSucc_ = isSucc_;
        result.costTime_ = costTime_;
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
        if (other instanceof DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify) {
          return mergeFrom((DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify other) {
        if (other == DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
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
        DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool isNewRecord = 4;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool isNewRecord = 4;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isNewRecord = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool isSucc = 5;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool isSucc = 5;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isSucc = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 costTime = 1;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 costTime = 1;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {
        
        costTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        
        costTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DuelHeartSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:DuelHeartSettleNotify)
    private static final DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify();
    }

    public static DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DuelHeartSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<DuelHeartSettleNotify>() {
      @java.lang.Override
      public DuelHeartSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DuelHeartSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DuelHeartSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DuelHeartSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DuelHeartSettleNotifyOuterClass.DuelHeartSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DuelHeartSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DuelHeartSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033DuelHeartSettleNotify.proto\"\240\001\n\025DuelHe" +
      "artSettleNotify\022\023\n\013isNewRecord\030\004 \001(\010\022\016\n\006" +
      "isSucc\030\005 \001(\010\022\020\n\010costTime\030\001 \001(\r\"P\n\013DCPKPJ" +
      "OKOHK\022\010\n\004NONE\020\000\022\021\n\013PEPPOHPHJOJ\020\257\241\001\022\017\n\013DC" +
      "DNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DuelHeartSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DuelHeartSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DuelHeartSettleNotify_descriptor,
        new java.lang.String[] { "IsNewRecord", "IsSucc", "CostTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
