// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssociateInferenceWordReq.proto

public final class AssociateInferenceWordReqOuterClass {
  private AssociateInferenceWordReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AssociateInferenceWordReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AssociateInferenceWordReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_EPMGHELECNH = 11;</code>
     * @return The unk3300EPMGHELECNH.
     */
    int getUnk3300EPMGHELECNH();

    /**
     * <code>uint32 pageId = 3;</code>
     * @return The pageId.
     */
    int getPageId();

    /**
     * <code>uint32 Unk3300_FDGLBLJOKOK = 13;</code>
     * @return The unk3300FDGLBLJOKOK.
     */
    int getUnk3300FDGLBLJOKOK();
  }
  /**
   * Protobuf type {@code AssociateInferenceWordReq}
   */
  public static final class AssociateInferenceWordReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AssociateInferenceWordReq)
      AssociateInferenceWordReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AssociateInferenceWordReq.newBuilder() to construct.
    private AssociateInferenceWordReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AssociateInferenceWordReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AssociateInferenceWordReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AssociateInferenceWordReq(
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

              pageId_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300EPMGHELECNH_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3300FDGLBLJOKOK_ = input.readUInt32();
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
      return AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.class, AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.Builder.class);
    }

    /**
     * Protobuf enum {@code AssociateInferenceWordReq.NCOBIJLLDLL}
     */
    public enum NCOBIJLLDLL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 456;</code>
       */
      PEPPOHPHJOJ(1, 456),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NCOBIJLLDLL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final NCOBIJLLDLL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 456;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 456;
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
      public static NCOBIJLLDLL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NCOBIJLLDLL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 456: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NCOBIJLLDLL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NCOBIJLLDLL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NCOBIJLLDLL>() {
              public NCOBIJLLDLL findValueByNumber(int number) {
                return NCOBIJLLDLL.forNumber(number);
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
        return AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final NCOBIJLLDLL[] VALUES = getStaticValuesArray();
      private static NCOBIJLLDLL[] getStaticValuesArray() {
        return new NCOBIJLLDLL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static NCOBIJLLDLL valueOf(
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

      private NCOBIJLLDLL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AssociateInferenceWordReq.NCOBIJLLDLL)
    }

    public static final int UNK3300_EPMGHELECNH_FIELD_NUMBER = 11;
    private int unk3300EPMGHELECNH_;
    /**
     * <code>uint32 Unk3300_EPMGHELECNH = 11;</code>
     * @return The unk3300EPMGHELECNH.
     */
    @java.lang.Override
    public int getUnk3300EPMGHELECNH() {
      return unk3300EPMGHELECNH_;
    }

    public static final int PAGEID_FIELD_NUMBER = 3;
    private int pageId_;
    /**
     * <code>uint32 pageId = 3;</code>
     * @return The pageId.
     */
    @java.lang.Override
    public int getPageId() {
      return pageId_;
    }

    public static final int UNK3300_FDGLBLJOKOK_FIELD_NUMBER = 13;
    private int unk3300FDGLBLJOKOK_;
    /**
     * <code>uint32 Unk3300_FDGLBLJOKOK = 13;</code>
     * @return The unk3300FDGLBLJOKOK.
     */
    @java.lang.Override
    public int getUnk3300FDGLBLJOKOK() {
      return unk3300FDGLBLJOKOK_;
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
      if (pageId_ != 0) {
        output.writeUInt32(3, pageId_);
      }
      if (unk3300EPMGHELECNH_ != 0) {
        output.writeUInt32(11, unk3300EPMGHELECNH_);
      }
      if (unk3300FDGLBLJOKOK_ != 0) {
        output.writeUInt32(13, unk3300FDGLBLJOKOK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, pageId_);
      }
      if (unk3300EPMGHELECNH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300EPMGHELECNH_);
      }
      if (unk3300FDGLBLJOKOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300FDGLBLJOKOK_);
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
      if (!(obj instanceof AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq)) {
        return super.equals(obj);
      }
      AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq other = (AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) obj;

      if (getUnk3300EPMGHELECNH()
          != other.getUnk3300EPMGHELECNH()) return false;
      if (getPageId()
          != other.getPageId()) return false;
      if (getUnk3300FDGLBLJOKOK()
          != other.getUnk3300FDGLBLJOKOK()) return false;
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
      hash = (37 * hash) + UNK3300_EPMGHELECNH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EPMGHELECNH();
      hash = (37 * hash) + PAGEID_FIELD_NUMBER;
      hash = (53 * hash) + getPageId();
      hash = (37 * hash) + UNK3300_FDGLBLJOKOK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FDGLBLJOKOK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parseFrom(
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
    public static Builder newBuilder(AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq prototype) {
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
     * Protobuf type {@code AssociateInferenceWordReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AssociateInferenceWordReq)
        AssociateInferenceWordReqOuterClass.AssociateInferenceWordReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.class, AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.Builder.class);
      }

      // Construct using AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.newBuilder()
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
        unk3300EPMGHELECNH_ = 0;

        pageId_ = 0;

        unk3300FDGLBLJOKOK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AssociateInferenceWordReqOuterClass.internal_static_AssociateInferenceWordReq_descriptor;
      }

      @java.lang.Override
      public AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstanceForType() {
        return AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.getDefaultInstance();
      }

      @java.lang.Override
      public AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq build() {
        AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq buildPartial() {
        AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq result = new AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq(this);
        result.unk3300EPMGHELECNH_ = unk3300EPMGHELECNH_;
        result.pageId_ = pageId_;
        result.unk3300FDGLBLJOKOK_ = unk3300FDGLBLJOKOK_;
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
        if (other instanceof AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) {
          return mergeFrom((AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq other) {
        if (other == AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq.getDefaultInstance()) return this;
        if (other.getUnk3300EPMGHELECNH() != 0) {
          setUnk3300EPMGHELECNH(other.getUnk3300EPMGHELECNH());
        }
        if (other.getPageId() != 0) {
          setPageId(other.getPageId());
        }
        if (other.getUnk3300FDGLBLJOKOK() != 0) {
          setUnk3300FDGLBLJOKOK(other.getUnk3300FDGLBLJOKOK());
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
        AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300EPMGHELECNH_ ;
      /**
       * <code>uint32 Unk3300_EPMGHELECNH = 11;</code>
       * @return The unk3300EPMGHELECNH.
       */
      @java.lang.Override
      public int getUnk3300EPMGHELECNH() {
        return unk3300EPMGHELECNH_;
      }
      /**
       * <code>uint32 Unk3300_EPMGHELECNH = 11;</code>
       * @param value The unk3300EPMGHELECNH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EPMGHELECNH(int value) {
        
        unk3300EPMGHELECNH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EPMGHELECNH = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EPMGHELECNH() {
        
        unk3300EPMGHELECNH_ = 0;
        onChanged();
        return this;
      }

      private int pageId_ ;
      /**
       * <code>uint32 pageId = 3;</code>
       * @return The pageId.
       */
      @java.lang.Override
      public int getPageId() {
        return pageId_;
      }
      /**
       * <code>uint32 pageId = 3;</code>
       * @param value The pageId to set.
       * @return This builder for chaining.
       */
      public Builder setPageId(int value) {
        
        pageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pageId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageId() {
        
        pageId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FDGLBLJOKOK_ ;
      /**
       * <code>uint32 Unk3300_FDGLBLJOKOK = 13;</code>
       * @return The unk3300FDGLBLJOKOK.
       */
      @java.lang.Override
      public int getUnk3300FDGLBLJOKOK() {
        return unk3300FDGLBLJOKOK_;
      }
      /**
       * <code>uint32 Unk3300_FDGLBLJOKOK = 13;</code>
       * @param value The unk3300FDGLBLJOKOK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FDGLBLJOKOK(int value) {
        
        unk3300FDGLBLJOKOK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FDGLBLJOKOK = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FDGLBLJOKOK() {
        
        unk3300FDGLBLJOKOK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AssociateInferenceWordReq)
    }

    // @@protoc_insertion_point(class_scope:AssociateInferenceWordReq)
    private static final AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq();
    }

    public static AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AssociateInferenceWordReq>
        PARSER = new com.google.protobuf.AbstractParser<AssociateInferenceWordReq>() {
      @java.lang.Override
      public AssociateInferenceWordReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssociateInferenceWordReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AssociateInferenceWordReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AssociateInferenceWordReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public AssociateInferenceWordReqOuterClass.AssociateInferenceWordReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AssociateInferenceWordReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AssociateInferenceWordReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AssociateInferenceWordReq.proto\"\307\001\n\031As" +
      "sociateInferenceWordReq\022\033\n\023Unk3300_EPMGH" +
      "ELECNH\030\013 \001(\r\022\016\n\006pageId\030\003 \001(\r\022\033\n\023Unk3300_" +
      "FDGLBLJOKOK\030\r \001(\r\"`\n\013NCOBIJLLDLL\022\010\n\004NONE" +
      "\020\000\022\020\n\013PEPPOHPHJOJ\020\310\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n" +
      "\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AssociateInferenceWordReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AssociateInferenceWordReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AssociateInferenceWordReq_descriptor,
        new java.lang.String[] { "Unk3300EPMGHELECNH", "PageId", "Unk3300FDGLBLJOKOK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
