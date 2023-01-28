// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeoffEquipReq.proto

public final class TakeoffEquipReqOuterClass {
  private TakeoffEquipReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeoffEquipReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeoffEquipReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatarGuid = 8;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 slot = 3;</code>
     * @return The slot.
     */
    int getSlot();
  }
  /**
   * Protobuf type {@code TakeoffEquipReq}
   */
  public static final class TakeoffEquipReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeoffEquipReq)
      TakeoffEquipReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeoffEquipReq.newBuilder() to construct.
    private TakeoffEquipReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeoffEquipReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeoffEquipReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeoffEquipReq(
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
            case 24: {

              slot_ = input.readUInt32();
              break;
            }
            case 64: {

              avatarGuid_ = input.readUInt64();
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
      return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TakeoffEquipReqOuterClass.TakeoffEquipReq.class, TakeoffEquipReqOuterClass.TakeoffEquipReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TakeoffEquipReq.BDAAHDJEMJF}
     */
    public enum BDAAHDJEMJF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 669;</code>
       */
      PEPPOHPHJOJ(1, 669),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BDAAHDJEMJF DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BDAAHDJEMJF EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 669;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 669;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BDAAHDJEMJF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BDAAHDJEMJF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 669: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BDAAHDJEMJF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BDAAHDJEMJF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BDAAHDJEMJF>() {
              public BDAAHDJEMJF findValueByNumber(int number) {
                return BDAAHDJEMJF.forNumber(number);
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
        return TakeoffEquipReqOuterClass.TakeoffEquipReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final BDAAHDJEMJF[] VALUES = getStaticValuesArray();
      private static BDAAHDJEMJF[] getStaticValuesArray() {
        return new BDAAHDJEMJF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BDAAHDJEMJF valueOf(
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

      private BDAAHDJEMJF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TakeoffEquipReq.BDAAHDJEMJF)
    }

    public static final int AVATARGUID_FIELD_NUMBER = 8;
    private long avatarGuid_;
    /**
     * <code>uint64 avatarGuid = 8;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int SLOT_FIELD_NUMBER = 3;
    private int slot_;
    /**
     * <code>uint32 slot = 3;</code>
     * @return The slot.
     */
    @java.lang.Override
    public int getSlot() {
      return slot_;
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
      if (slot_ != 0) {
        output.writeUInt32(3, slot_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(8, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slot_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, slot_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, avatarGuid_);
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
      if (!(obj instanceof TakeoffEquipReqOuterClass.TakeoffEquipReq)) {
        return super.equals(obj);
      }
      TakeoffEquipReqOuterClass.TakeoffEquipReq other = (TakeoffEquipReqOuterClass.TakeoffEquipReq) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getSlot()
          != other.getSlot()) return false;
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
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + SLOT_FIELD_NUMBER;
      hash = (53 * hash) + getSlot();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TakeoffEquipReqOuterClass.TakeoffEquipReq parseFrom(
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
    public static Builder newBuilder(TakeoffEquipReqOuterClass.TakeoffEquipReq prototype) {
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
     * Protobuf type {@code TakeoffEquipReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeoffEquipReq)
        TakeoffEquipReqOuterClass.TakeoffEquipReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TakeoffEquipReqOuterClass.TakeoffEquipReq.class, TakeoffEquipReqOuterClass.TakeoffEquipReq.Builder.class);
      }

      // Construct using TakeoffEquipReqOuterClass.TakeoffEquipReq.newBuilder()
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
        avatarGuid_ = 0L;

        slot_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TakeoffEquipReqOuterClass.internal_static_TakeoffEquipReq_descriptor;
      }

      @java.lang.Override
      public TakeoffEquipReqOuterClass.TakeoffEquipReq getDefaultInstanceForType() {
        return TakeoffEquipReqOuterClass.TakeoffEquipReq.getDefaultInstance();
      }

      @java.lang.Override
      public TakeoffEquipReqOuterClass.TakeoffEquipReq build() {
        TakeoffEquipReqOuterClass.TakeoffEquipReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public TakeoffEquipReqOuterClass.TakeoffEquipReq buildPartial() {
        TakeoffEquipReqOuterClass.TakeoffEquipReq result = new TakeoffEquipReqOuterClass.TakeoffEquipReq(this);
        result.avatarGuid_ = avatarGuid_;
        result.slot_ = slot_;
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
        if (other instanceof TakeoffEquipReqOuterClass.TakeoffEquipReq) {
          return mergeFrom((TakeoffEquipReqOuterClass.TakeoffEquipReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TakeoffEquipReqOuterClass.TakeoffEquipReq other) {
        if (other == TakeoffEquipReqOuterClass.TakeoffEquipReq.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getSlot() != 0) {
          setSlot(other.getSlot());
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
        TakeoffEquipReqOuterClass.TakeoffEquipReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TakeoffEquipReqOuterClass.TakeoffEquipReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 8;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 8;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int slot_ ;
      /**
       * <code>uint32 slot = 3;</code>
       * @return The slot.
       */
      @java.lang.Override
      public int getSlot() {
        return slot_;
      }
      /**
       * <code>uint32 slot = 3;</code>
       * @param value The slot to set.
       * @return This builder for chaining.
       */
      public Builder setSlot(int value) {
        
        slot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlot() {
        
        slot_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeoffEquipReq)
    }

    // @@protoc_insertion_point(class_scope:TakeoffEquipReq)
    private static final TakeoffEquipReqOuterClass.TakeoffEquipReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TakeoffEquipReqOuterClass.TakeoffEquipReq();
    }

    public static TakeoffEquipReqOuterClass.TakeoffEquipReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeoffEquipReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeoffEquipReq>() {
      @java.lang.Override
      public TakeoffEquipReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeoffEquipReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeoffEquipReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeoffEquipReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public TakeoffEquipReqOuterClass.TakeoffEquipReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeoffEquipReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeoffEquipReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TakeoffEquipReq.proto\"\225\001\n\017TakeoffEquip" +
      "Req\022\022\n\navatarGuid\030\010 \001(\004\022\014\n\004slot\030\003 \001(\r\"`\n" +
      "\013BDAAHDJEMJF\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\235\005" +
      "\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EA" +
      "JIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeoffEquipReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeoffEquipReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeoffEquipReq_descriptor,
        new java.lang.String[] { "AvatarGuid", "Slot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
