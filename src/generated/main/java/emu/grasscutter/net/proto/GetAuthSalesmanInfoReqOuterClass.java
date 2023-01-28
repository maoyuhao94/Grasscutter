// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAuthSalesmanInfoReq.proto

public final class GetAuthSalesmanInfoReqOuterClass {
  private GetAuthSalesmanInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAuthSalesmanInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAuthSalesmanInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scheduleId = 8;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * Protobuf type {@code GetAuthSalesmanInfoReq}
   */
  public static final class GetAuthSalesmanInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAuthSalesmanInfoReq)
      GetAuthSalesmanInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAuthSalesmanInfoReq.newBuilder() to construct.
    private GetAuthSalesmanInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAuthSalesmanInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAuthSalesmanInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAuthSalesmanInfoReq(
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
            case 64: {

              scheduleId_ = input.readUInt32();
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
      return GetAuthSalesmanInfoReqOuterClass.internal_static_GetAuthSalesmanInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GetAuthSalesmanInfoReqOuterClass.internal_static_GetAuthSalesmanInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.class, GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.Builder.class);
    }

    /**
     * Protobuf enum {@code GetAuthSalesmanInfoReq.LBFMBJMBPNJ}
     */
    public enum LBFMBJMBPNJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 2108;</code>
       */
      PEPPOHPHJOJ(1, 2108),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final LBFMBJMBPNJ DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final LBFMBJMBPNJ EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 2108;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 2108;
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
      public static LBFMBJMBPNJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LBFMBJMBPNJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 2108: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LBFMBJMBPNJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LBFMBJMBPNJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LBFMBJMBPNJ>() {
              public LBFMBJMBPNJ findValueByNumber(int number) {
                return LBFMBJMBPNJ.forNumber(number);
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
        return GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final LBFMBJMBPNJ[] VALUES = getStaticValuesArray();
      private static LBFMBJMBPNJ[] getStaticValuesArray() {
        return new LBFMBJMBPNJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static LBFMBJMBPNJ valueOf(
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

      private LBFMBJMBPNJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GetAuthSalesmanInfoReq.LBFMBJMBPNJ)
    }

    public static final int SCHEDULEID_FIELD_NUMBER = 8;
    private int scheduleId_;
    /**
     * <code>uint32 scheduleId = 8;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (scheduleId_ != 0) {
        output.writeUInt32(8, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, scheduleId_);
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
      if (!(obj instanceof GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq)) {
        return super.equals(obj);
      }
      GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq other = (GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + SCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parseFrom(
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
    public static Builder newBuilder(GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq prototype) {
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
     * Protobuf type {@code GetAuthSalesmanInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAuthSalesmanInfoReq)
        GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GetAuthSalesmanInfoReqOuterClass.internal_static_GetAuthSalesmanInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GetAuthSalesmanInfoReqOuterClass.internal_static_GetAuthSalesmanInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.class, GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.Builder.class);
      }

      // Construct using GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.newBuilder()
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
        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetAuthSalesmanInfoReqOuterClass.internal_static_GetAuthSalesmanInfoReq_descriptor;
      }

      @java.lang.Override
      public GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq getDefaultInstanceForType() {
        return GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq build() {
        GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq buildPartial() {
        GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq result = new GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq(this);
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq) {
          return mergeFrom((GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq other) {
        if (other == GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 scheduleId = 8;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 scheduleId = 8;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scheduleId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetAuthSalesmanInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetAuthSalesmanInfoReq)
    private static final GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq();
    }

    public static GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAuthSalesmanInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetAuthSalesmanInfoReq>() {
      @java.lang.Override
      public GetAuthSalesmanInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAuthSalesmanInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAuthSalesmanInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAuthSalesmanInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GetAuthSalesmanInfoReqOuterClass.GetAuthSalesmanInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAuthSalesmanInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAuthSalesmanInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetAuthSalesmanInfoReq.proto\"\216\001\n\026GetAu" +
      "thSalesmanInfoReq\022\022\n\nscheduleId\030\010 \001(\r\"`\n" +
      "\013LBFMBJMBPNJ\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\274\020" +
      "\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EA" +
      "JIABGAOCI\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAuthSalesmanInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAuthSalesmanInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAuthSalesmanInfoReq_descriptor,
        new java.lang.String[] { "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
