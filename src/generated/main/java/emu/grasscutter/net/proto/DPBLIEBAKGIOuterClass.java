// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DPBLIEBAKGI.proto

public final class DPBLIEBAKGIOuterClass {
  private DPBLIEBAKGIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DPBLIEBAKGIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DPBLIEBAKGI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool oahpenjnboe = 1;</code>
     * @return The oahpenjnboe.
     */
    boolean getOahpenjnboe();

    /**
     * <code>bool gimhlmfcojd = 2;</code>
     * @return The gimhlmfcojd.
     */
    boolean getGimhlmfcojd();

    /**
     * <code>bool aicefchaici = 3;</code>
     * @return The aicefchaici.
     */
    boolean getAicefchaici();

    /**
     * <code>bool docgilpleod = 7;</code>
     * @return The docgilpleod.
     */
    boolean getDocgilpleod();

    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP> 
        getKcllbppibooList();
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    IDOELHBANCPOuterClass.IDOELHBANCP getKcllbppiboo(int index);
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    int getKcllbppibooCount();
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    java.util.List<? extends IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder> 
        getKcllbppibooOrBuilderList();
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder getKcllbppibooOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code DPBLIEBAKGI}
   */
  public static final class DPBLIEBAKGI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DPBLIEBAKGI)
      DPBLIEBAKGIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DPBLIEBAKGI.newBuilder() to construct.
    private DPBLIEBAKGI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DPBLIEBAKGI() {
      kcllbppiboo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DPBLIEBAKGI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DPBLIEBAKGI(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              oahpenjnboe_ = input.readBool();
              break;
            }
            case 16: {

              gimhlmfcojd_ = input.readBool();
              break;
            }
            case 24: {

              aicefchaici_ = input.readBool();
              break;
            }
            case 56: {

              docgilpleod_ = input.readBool();
              break;
            }
            case 7994: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                kcllbppiboo_ = new java.util.ArrayList<IDOELHBANCPOuterClass.IDOELHBANCP>();
                mutable_bitField0_ |= 0x00000001;
              }
              kcllbppiboo_.add(
                  input.readMessage(IDOELHBANCPOuterClass.IDOELHBANCP.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          kcllbppiboo_ = java.util.Collections.unmodifiableList(kcllbppiboo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DPBLIEBAKGIOuterClass.internal_static_DPBLIEBAKGI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DPBLIEBAKGIOuterClass.internal_static_DPBLIEBAKGI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DPBLIEBAKGIOuterClass.DPBLIEBAKGI.class, DPBLIEBAKGIOuterClass.DPBLIEBAKGI.Builder.class);
    }

    public static final int OAHPENJNBOE_FIELD_NUMBER = 1;
    private boolean oahpenjnboe_;
    /**
     * <code>bool oahpenjnboe = 1;</code>
     * @return The oahpenjnboe.
     */
    @java.lang.Override
    public boolean getOahpenjnboe() {
      return oahpenjnboe_;
    }

    public static final int GIMHLMFCOJD_FIELD_NUMBER = 2;
    private boolean gimhlmfcojd_;
    /**
     * <code>bool gimhlmfcojd = 2;</code>
     * @return The gimhlmfcojd.
     */
    @java.lang.Override
    public boolean getGimhlmfcojd() {
      return gimhlmfcojd_;
    }

    public static final int AICEFCHAICI_FIELD_NUMBER = 3;
    private boolean aicefchaici_;
    /**
     * <code>bool aicefchaici = 3;</code>
     * @return The aicefchaici.
     */
    @java.lang.Override
    public boolean getAicefchaici() {
      return aicefchaici_;
    }

    public static final int DOCGILPLEOD_FIELD_NUMBER = 7;
    private boolean docgilpleod_;
    /**
     * <code>bool docgilpleod = 7;</code>
     * @return The docgilpleod.
     */
    @java.lang.Override
    public boolean getDocgilpleod() {
      return docgilpleod_;
    }

    public static final int KCLLBPPIBOO_FIELD_NUMBER = 999;
    private java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP> kcllbppiboo_;
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    @java.lang.Override
    public java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP> getKcllbppibooList() {
      return kcllbppiboo_;
    }
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    @java.lang.Override
    public java.util.List<? extends IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder> 
        getKcllbppibooOrBuilderList() {
      return kcllbppiboo_;
    }
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    @java.lang.Override
    public int getKcllbppibooCount() {
      return kcllbppiboo_.size();
    }
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    @java.lang.Override
    public IDOELHBANCPOuterClass.IDOELHBANCP getKcllbppiboo(int index) {
      return kcllbppiboo_.get(index);
    }
    /**
     * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
     */
    @java.lang.Override
    public IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder getKcllbppibooOrBuilder(
        int index) {
      return kcllbppiboo_.get(index);
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
      if (oahpenjnboe_ != false) {
        output.writeBool(1, oahpenjnboe_);
      }
      if (gimhlmfcojd_ != false) {
        output.writeBool(2, gimhlmfcojd_);
      }
      if (aicefchaici_ != false) {
        output.writeBool(3, aicefchaici_);
      }
      if (docgilpleod_ != false) {
        output.writeBool(7, docgilpleod_);
      }
      for (int i = 0; i < kcllbppiboo_.size(); i++) {
        output.writeMessage(999, kcllbppiboo_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oahpenjnboe_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, oahpenjnboe_);
      }
      if (gimhlmfcojd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, gimhlmfcojd_);
      }
      if (aicefchaici_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, aicefchaici_);
      }
      if (docgilpleod_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, docgilpleod_);
      }
      for (int i = 0; i < kcllbppiboo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(999, kcllbppiboo_.get(i));
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
      if (!(obj instanceof DPBLIEBAKGIOuterClass.DPBLIEBAKGI)) {
        return super.equals(obj);
      }
      DPBLIEBAKGIOuterClass.DPBLIEBAKGI other = (DPBLIEBAKGIOuterClass.DPBLIEBAKGI) obj;

      if (getOahpenjnboe()
          != other.getOahpenjnboe()) return false;
      if (getGimhlmfcojd()
          != other.getGimhlmfcojd()) return false;
      if (getAicefchaici()
          != other.getAicefchaici()) return false;
      if (getDocgilpleod()
          != other.getDocgilpleod()) return false;
      if (!getKcllbppibooList()
          .equals(other.getKcllbppibooList())) return false;
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
      hash = (37 * hash) + OAHPENJNBOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOahpenjnboe());
      hash = (37 * hash) + GIMHLMFCOJD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGimhlmfcojd());
      hash = (37 * hash) + AICEFCHAICI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAicefchaici());
      hash = (37 * hash) + DOCGILPLEOD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDocgilpleod());
      if (getKcllbppibooCount() > 0) {
        hash = (37 * hash) + KCLLBPPIBOO_FIELD_NUMBER;
        hash = (53 * hash) + getKcllbppibooList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI parseFrom(
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
    public static Builder newBuilder(DPBLIEBAKGIOuterClass.DPBLIEBAKGI prototype) {
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
     * Protobuf type {@code DPBLIEBAKGI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DPBLIEBAKGI)
        DPBLIEBAKGIOuterClass.DPBLIEBAKGIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DPBLIEBAKGIOuterClass.internal_static_DPBLIEBAKGI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DPBLIEBAKGIOuterClass.internal_static_DPBLIEBAKGI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DPBLIEBAKGIOuterClass.DPBLIEBAKGI.class, DPBLIEBAKGIOuterClass.DPBLIEBAKGI.Builder.class);
      }

      // Construct using DPBLIEBAKGIOuterClass.DPBLIEBAKGI.newBuilder()
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
          getKcllbppibooFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        oahpenjnboe_ = false;

        gimhlmfcojd_ = false;

        aicefchaici_ = false;

        docgilpleod_ = false;

        if (kcllbppibooBuilder_ == null) {
          kcllbppiboo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          kcllbppibooBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DPBLIEBAKGIOuterClass.internal_static_DPBLIEBAKGI_descriptor;
      }

      @java.lang.Override
      public DPBLIEBAKGIOuterClass.DPBLIEBAKGI getDefaultInstanceForType() {
        return DPBLIEBAKGIOuterClass.DPBLIEBAKGI.getDefaultInstance();
      }

      @java.lang.Override
      public DPBLIEBAKGIOuterClass.DPBLIEBAKGI build() {
        DPBLIEBAKGIOuterClass.DPBLIEBAKGI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public DPBLIEBAKGIOuterClass.DPBLIEBAKGI buildPartial() {
        DPBLIEBAKGIOuterClass.DPBLIEBAKGI result = new DPBLIEBAKGIOuterClass.DPBLIEBAKGI(this);
        int from_bitField0_ = bitField0_;
        result.oahpenjnboe_ = oahpenjnboe_;
        result.gimhlmfcojd_ = gimhlmfcojd_;
        result.aicefchaici_ = aicefchaici_;
        result.docgilpleod_ = docgilpleod_;
        if (kcllbppibooBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            kcllbppiboo_ = java.util.Collections.unmodifiableList(kcllbppiboo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.kcllbppiboo_ = kcllbppiboo_;
        } else {
          result.kcllbppiboo_ = kcllbppibooBuilder_.build();
        }
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
        if (other instanceof DPBLIEBAKGIOuterClass.DPBLIEBAKGI) {
          return mergeFrom((DPBLIEBAKGIOuterClass.DPBLIEBAKGI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DPBLIEBAKGIOuterClass.DPBLIEBAKGI other) {
        if (other == DPBLIEBAKGIOuterClass.DPBLIEBAKGI.getDefaultInstance()) return this;
        if (other.getOahpenjnboe() != false) {
          setOahpenjnboe(other.getOahpenjnboe());
        }
        if (other.getGimhlmfcojd() != false) {
          setGimhlmfcojd(other.getGimhlmfcojd());
        }
        if (other.getAicefchaici() != false) {
          setAicefchaici(other.getAicefchaici());
        }
        if (other.getDocgilpleod() != false) {
          setDocgilpleod(other.getDocgilpleod());
        }
        if (kcllbppibooBuilder_ == null) {
          if (!other.kcllbppiboo_.isEmpty()) {
            if (kcllbppiboo_.isEmpty()) {
              kcllbppiboo_ = other.kcllbppiboo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureKcllbppibooIsMutable();
              kcllbppiboo_.addAll(other.kcllbppiboo_);
            }
            onChanged();
          }
        } else {
          if (!other.kcllbppiboo_.isEmpty()) {
            if (kcllbppibooBuilder_.isEmpty()) {
              kcllbppibooBuilder_.dispose();
              kcllbppibooBuilder_ = null;
              kcllbppiboo_ = other.kcllbppiboo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              kcllbppibooBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getKcllbppibooFieldBuilder() : null;
            } else {
              kcllbppibooBuilder_.addAllMessages(other.kcllbppiboo_);
            }
          }
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
        DPBLIEBAKGIOuterClass.DPBLIEBAKGI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DPBLIEBAKGIOuterClass.DPBLIEBAKGI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean oahpenjnboe_ ;
      /**
       * <code>bool oahpenjnboe = 1;</code>
       * @return The oahpenjnboe.
       */
      @java.lang.Override
      public boolean getOahpenjnboe() {
        return oahpenjnboe_;
      }
      /**
       * <code>bool oahpenjnboe = 1;</code>
       * @param value The oahpenjnboe to set.
       * @return This builder for chaining.
       */
      public Builder setOahpenjnboe(boolean value) {
        
        oahpenjnboe_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool oahpenjnboe = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOahpenjnboe() {
        
        oahpenjnboe_ = false;
        onChanged();
        return this;
      }

      private boolean gimhlmfcojd_ ;
      /**
       * <code>bool gimhlmfcojd = 2;</code>
       * @return The gimhlmfcojd.
       */
      @java.lang.Override
      public boolean getGimhlmfcojd() {
        return gimhlmfcojd_;
      }
      /**
       * <code>bool gimhlmfcojd = 2;</code>
       * @param value The gimhlmfcojd to set.
       * @return This builder for chaining.
       */
      public Builder setGimhlmfcojd(boolean value) {
        
        gimhlmfcojd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool gimhlmfcojd = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGimhlmfcojd() {
        
        gimhlmfcojd_ = false;
        onChanged();
        return this;
      }

      private boolean aicefchaici_ ;
      /**
       * <code>bool aicefchaici = 3;</code>
       * @return The aicefchaici.
       */
      @java.lang.Override
      public boolean getAicefchaici() {
        return aicefchaici_;
      }
      /**
       * <code>bool aicefchaici = 3;</code>
       * @param value The aicefchaici to set.
       * @return This builder for chaining.
       */
      public Builder setAicefchaici(boolean value) {
        
        aicefchaici_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool aicefchaici = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAicefchaici() {
        
        aicefchaici_ = false;
        onChanged();
        return this;
      }

      private boolean docgilpleod_ ;
      /**
       * <code>bool docgilpleod = 7;</code>
       * @return The docgilpleod.
       */
      @java.lang.Override
      public boolean getDocgilpleod() {
        return docgilpleod_;
      }
      /**
       * <code>bool docgilpleod = 7;</code>
       * @param value The docgilpleod to set.
       * @return This builder for chaining.
       */
      public Builder setDocgilpleod(boolean value) {
        
        docgilpleod_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool docgilpleod = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDocgilpleod() {
        
        docgilpleod_ = false;
        onChanged();
        return this;
      }

      private java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP> kcllbppiboo_ =
        java.util.Collections.emptyList();
      private void ensureKcllbppibooIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          kcllbppiboo_ = new java.util.ArrayList<IDOELHBANCPOuterClass.IDOELHBANCP>(kcllbppiboo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          IDOELHBANCPOuterClass.IDOELHBANCP, IDOELHBANCPOuterClass.IDOELHBANCP.Builder, IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder> kcllbppibooBuilder_;

      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP> getKcllbppibooList() {
        if (kcllbppibooBuilder_ == null) {
          return java.util.Collections.unmodifiableList(kcllbppiboo_);
        } else {
          return kcllbppibooBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public int getKcllbppibooCount() {
        if (kcllbppibooBuilder_ == null) {
          return kcllbppiboo_.size();
        } else {
          return kcllbppibooBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public IDOELHBANCPOuterClass.IDOELHBANCP getKcllbppiboo(int index) {
        if (kcllbppibooBuilder_ == null) {
          return kcllbppiboo_.get(index);
        } else {
          return kcllbppibooBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder setKcllbppiboo(
          int index, IDOELHBANCPOuterClass.IDOELHBANCP value) {
        if (kcllbppibooBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.set(index, value);
          onChanged();
        } else {
          kcllbppibooBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder setKcllbppiboo(
          int index, IDOELHBANCPOuterClass.IDOELHBANCP.Builder builderForValue) {
        if (kcllbppibooBuilder_ == null) {
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.set(index, builderForValue.build());
          onChanged();
        } else {
          kcllbppibooBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder addKcllbppiboo(IDOELHBANCPOuterClass.IDOELHBANCP value) {
        if (kcllbppibooBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.add(value);
          onChanged();
        } else {
          kcllbppibooBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder addKcllbppiboo(
          int index, IDOELHBANCPOuterClass.IDOELHBANCP value) {
        if (kcllbppibooBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.add(index, value);
          onChanged();
        } else {
          kcllbppibooBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder addKcllbppiboo(
          IDOELHBANCPOuterClass.IDOELHBANCP.Builder builderForValue) {
        if (kcllbppibooBuilder_ == null) {
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.add(builderForValue.build());
          onChanged();
        } else {
          kcllbppibooBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder addKcllbppiboo(
          int index, IDOELHBANCPOuterClass.IDOELHBANCP.Builder builderForValue) {
        if (kcllbppibooBuilder_ == null) {
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.add(index, builderForValue.build());
          onChanged();
        } else {
          kcllbppibooBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder addAllKcllbppiboo(
          java.lang.Iterable<? extends IDOELHBANCPOuterClass.IDOELHBANCP> values) {
        if (kcllbppibooBuilder_ == null) {
          ensureKcllbppibooIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, kcllbppiboo_);
          onChanged();
        } else {
          kcllbppibooBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder clearKcllbppiboo() {
        if (kcllbppibooBuilder_ == null) {
          kcllbppiboo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          kcllbppibooBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public Builder removeKcllbppiboo(int index) {
        if (kcllbppibooBuilder_ == null) {
          ensureKcllbppibooIsMutable();
          kcllbppiboo_.remove(index);
          onChanged();
        } else {
          kcllbppibooBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public IDOELHBANCPOuterClass.IDOELHBANCP.Builder getKcllbppibooBuilder(
          int index) {
        return getKcllbppibooFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder getKcllbppibooOrBuilder(
          int index) {
        if (kcllbppibooBuilder_ == null) {
          return kcllbppiboo_.get(index);  } else {
          return kcllbppibooBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public java.util.List<? extends IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder> 
           getKcllbppibooOrBuilderList() {
        if (kcllbppibooBuilder_ != null) {
          return kcllbppibooBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(kcllbppiboo_);
        }
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public IDOELHBANCPOuterClass.IDOELHBANCP.Builder addKcllbppibooBuilder() {
        return getKcllbppibooFieldBuilder().addBuilder(
            IDOELHBANCPOuterClass.IDOELHBANCP.getDefaultInstance());
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public IDOELHBANCPOuterClass.IDOELHBANCP.Builder addKcllbppibooBuilder(
          int index) {
        return getKcllbppibooFieldBuilder().addBuilder(
            index, IDOELHBANCPOuterClass.IDOELHBANCP.getDefaultInstance());
      }
      /**
       * <code>repeated .IDOELHBANCP kcllbppiboo = 999;</code>
       */
      public java.util.List<IDOELHBANCPOuterClass.IDOELHBANCP.Builder> 
           getKcllbppibooBuilderList() {
        return getKcllbppibooFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          IDOELHBANCPOuterClass.IDOELHBANCP, IDOELHBANCPOuterClass.IDOELHBANCP.Builder, IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder> 
          getKcllbppibooFieldBuilder() {
        if (kcllbppibooBuilder_ == null) {
          kcllbppibooBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              IDOELHBANCPOuterClass.IDOELHBANCP, IDOELHBANCPOuterClass.IDOELHBANCP.Builder, IDOELHBANCPOuterClass.IDOELHBANCPOrBuilder>(
                  kcllbppiboo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          kcllbppiboo_ = null;
        }
        return kcllbppibooBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DPBLIEBAKGI)
    }

    // @@protoc_insertion_point(class_scope:DPBLIEBAKGI)
    private static final DPBLIEBAKGIOuterClass.DPBLIEBAKGI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DPBLIEBAKGIOuterClass.DPBLIEBAKGI();
    }

    public static DPBLIEBAKGIOuterClass.DPBLIEBAKGI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DPBLIEBAKGI>
        PARSER = new com.google.protobuf.AbstractParser<DPBLIEBAKGI>() {
      @java.lang.Override
      public DPBLIEBAKGI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DPBLIEBAKGI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DPBLIEBAKGI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DPBLIEBAKGI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public DPBLIEBAKGIOuterClass.DPBLIEBAKGI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DPBLIEBAKGI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DPBLIEBAKGI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DPBLIEBAKGI.proto\032\021IDOELHBANCP.proto\"\205" +
      "\001\n\013DPBLIEBAKGI\022\023\n\013oahpenjnboe\030\001 \001(\010\022\023\n\013g" +
      "imhlmfcojd\030\002 \001(\010\022\023\n\013aicefchaici\030\003 \001(\010\022\023\n" +
      "\013docgilpleod\030\007 \001(\010\022\"\n\013kcllbppiboo\030\347\007 \003(\013" +
      "2\014.IDOELHBANCPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          IDOELHBANCPOuterClass.getDescriptor(),
        });
    internal_static_DPBLIEBAKGI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DPBLIEBAKGI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DPBLIEBAKGI_descriptor,
        new java.lang.String[] { "Oahpenjnboe", "Gimhlmfcojd", "Aicefchaici", "Docgilpleod", "Kcllbppiboo", });
    IDOELHBANCPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
