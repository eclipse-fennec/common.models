/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Locally Accessible File System Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LocallyAccessibleFileSystemSetting is a derived class of ScopedSettingData that specifies the attribute values set for a Filesystem that has been made locally accessible to the ComputerSystem. The ComputerSystem provides the scope (indicated via the ScopedSetting association).A FileSystem is 'locally accessible' to a ComputerSystem if a LocalAccessAvailable association exists between it and the ComputerSystem. This Setting provides further details on the functionality supported when locally accessible.When used as a setting for a FileSystem, these settings are associated with the FileSystem via the ElementSettingData association and cannot have undefined or NULL properties. When used to define a LocallyAccessibleFileSystemCapabilities via the SettingsDefineCapabilities association, these settings must be scoped to the ComputerSystem supported by the Capabilities element and cannot have undefined or NULL properties. Property values that represent an implementation-specific default can only be specified when this setting is used ina TemplateSettings parameter to the LocallyAccessibleFileSystemCapabilities.CreateGoalSettings() method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getFailurePolicy <em>Failure Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRetriesMax <em>Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getInitialEnabledState <em>Initial Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRequestRetryPolicy <em>Request Retry Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getTransmissionRetriesMax <em>Transmission Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRetransmissionTimeoutMin <em>Retransmission Timeout Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getCachingOptions <em>Caching Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getBuffersSupport <em>Buffers Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadBufferSizeMin <em>Read Buffer Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadBufferSizeMax <em>Read Buffer Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getWriteBufferSizeMin <em>Write Buffer Size Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getWriteBufferSizeMax <em>Write Buffer Size Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getAttributeCaching <em>Attribute Caching</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getAttributeCachingObjects <em>Attribute Caching Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getAttributeCachingTimeMin <em>Attribute Caching Time Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getAttributeCachingTimeMax <em>Attribute Caching Time Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadWritePolicy <em>Read Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getEnableOnSystemStart <em>Enable On System Start</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadWritePref <em>Read Write Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getExecutePref <em>Execute Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRootAccessPref <em>Root Access Pref</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FilesystemServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LocallyAccessibleFileSystemSetting extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Failure Policy</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if the operation to make a FileSystem locally accessible to a scoping ComputerSystem should be attempted one or more times in the foreground or tried repeatedly in the background until it succeeds. The number of attempts would be limited by the corresponding RetriesMax property of the setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Policy</em>' attribute.
	 * @see #setFailurePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_FailurePolicy()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Foreground\",\"Background\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.RetriesMax\"]'"
	 * @generated
	 */
	Integer getFailurePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getFailurePolicy <em>Failure Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Policy</em>' attribute.
	 * @see #getFailurePolicy()
	 * @generated
	 */
	void setFailurePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Retries Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the maximum number of attempts that should be made by the scoping ComputerSystem to make a Filesystem locally accessible.A value of '0' specifies an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retries Max</em>' attribute.
	 * @see #setRetriesMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_RetriesMax()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.FailurePolicy\"]'"
	 * @generated
	 */
	Long getRetriesMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRetriesMax <em>Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries Max</em>' attribute.
	 * @see #getRetriesMax()
	 * @generated
	 */
	void setRetriesMax(Long value);

	/**
	 * Returns the value of the '<em><b>Initial Enabled State</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InitialEnabledState is an integer enumeration that indicates the enabled/disabled states initially set for a locally accessible file system (LAFS). The element functions by passing commands onto the underlying filesystem, and so cannotindicate transitions between requested states because those states cannot be requested. The following text briefly summarizes the various enabled/disabled initial states: 
	 * Enabled (2) indicates that the element will execute commands, will process any queued commands, and will queue new requests. 
	 * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
	 * In Test (7) indicates that the element will be in a test state. 
	 * Deferred (8) indicates that the element will not process any commands but will queue new requests. 
	 * Quiesce (9) indicates that the element is enabled but in a restricted mode. The element's behavior is similar to the Enabled state, but it only processes a restricted set of commands. All other requests are queued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #setInitialEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_InitialEnabledState()
	 * @model default="8"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"7\",\"8\",\"9\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"In Test\",\"Deferred\",\"Quiesce\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.OtherEnabledState\",\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getInitialEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getInitialEnabledState <em>Initial Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Enabled State</em>' attribute.
	 * @see #getInitialEnabledState()
	 * @generated
	 */
	void setInitialEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the element's initial enabled/disabled state when the InitialEnabledState property is set to 1 ("Other"). This property MUST be set to NULL when InitialEnabledState is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled State</em>' attribute.
	 * @see #setOtherEnabledState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_OtherEnabledState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.InitialEnabledState\",\"CIM_EnabledLogicalElement.OtherEnabledState\"]'"
	 * @generated
	 */
	String getOtherEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getOtherEnabledState <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled State</em>' attribute.
	 * @see #getOtherEnabledState()
	 * @generated
	 */
	void setOtherEnabledState(String value);

	/**
	 * Returns the value of the '<em><b>Request Retry Policy</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value representing the policy that is supported by the operational file server on a request to the operational file system that either failed or left the file server hanging. If the request is being performed in the foreground, the options are to try once and fail if a timeout happens, or, to try repeatedly. If the request can be performed in the background, the request will be tried repeatedly until stopped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Retry Policy</em>' attribute.
	 * @see #setRequestRetryPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_RequestRetryPolicy()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Try Once\",\"Try Again\",\"Try in Background\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.TransmissionRetriesMax\",\"CIM_LocallyAccessibleFileSystemSetting.RetransmissionTimeoutMin\"]'"
	 * @generated
	 */
	Integer getRequestRetryPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRequestRetryPolicy <em>Request Retry Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Retry Policy</em>' attribute.
	 * @see #getRequestRetryPolicy()
	 * @generated
	 */
	void setRequestRetryPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Transmission Retries Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the maximum number of retransmission attempts to be made from the operational file server to the operational file system when the transmission of a request fails or makes the file server hang. A value of '0' specifies an implementation-specific default.This is only relevant if there is a transmission channel between the file server and the underlying file system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Retries Max</em>' attribute.
	 * @see #setTransmissionRetriesMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_TransmissionRetriesMax()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.RequestRetryPolicy\",\"CIM_LocallyAccessibleFileSystemSetting.RetransmissionTimeoutMin\"]'"
	 * @generated
	 */
	Long getTransmissionRetriesMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getTransmissionRetriesMax <em>Transmission Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Retries Max</em>' attribute.
	 * @see #getTransmissionRetriesMax()
	 * @generated
	 */
	void setTransmissionRetriesMax(Long value);

	/**
	 * Returns the value of the '<em><b>Retransmission Timeout Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the minimum number of milliseconds that the operational file server must wait before assuming that a request to the operational file system has failed. A value of '0' indicates an implementation-specific default.This is only relevant if there is a transmission channel between the operational file server and the operational file system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retransmission Timeout Min</em>' attribute.
	 * @see #setRetransmissionTimeoutMin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_RetransmissionTimeoutMin()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.TransmissionRetriesMax\",\"CIM_LocallyAccessibleFileSystemSetting.RequestRetryPolicy\"]'"
	 * @generated
	 */
	Long getRetransmissionTimeoutMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRetransmissionTimeoutMin <em>Retransmission Timeout Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmission Timeout Min</em>' attribute.
	 * @see #getRetransmissionTimeoutMin()
	 * @generated
	 */
	void setRetransmissionTimeoutMin(Long value);

	/**
	 * Returns the value of the '<em><b>Caching Options</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if a local cache is supported by the operational file server when accessing the underlying operational file system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caching Options</em>' attribute.
	 * @see #setCachingOptions(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_CachingOptions()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Not Supported\",\"Asynchronized\",\"Synchronized\",\"Write-Through\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getCachingOptions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getCachingOptions <em>Caching Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Options</em>' attribute.
	 * @see #getCachingOptions()
	 * @generated
	 */
	void setCachingOptions(Integer value);

	/**
	 * Returns the value of the '<em><b>Buffers Support</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array or enumerated values that specifies the buffering mechanisms supported by the operational file server for accessing the underlying operational file system.If supported, other properties will establish the level of support. If the property is NULL or the empty array, buffering is not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffers Support</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_BuffersSupport()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Attributes\",\"Read\",\"Write\",\"DMTF Reserved\",\"Vendor Defined\"]' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.ReadBufferSizeMax\",\"CIM_LocallyAccessibleFileSystemSetting.ReadBufferSizeMin\",\"CIM_LocallyAccessibleFileSystemSetting.WriteBufferSizeMax\",\"CIM_LocallyAccessibleFileSystemSetting.WriteBufferSizeMin\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCaching\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingObjects\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMin\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMax\"]'"
	 * @generated
	 */
	EList<Integer> getBuffersSupport();

	/**
	 * Returns the value of the '<em><b>Read Buffer Size Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the minimum number of bytes that must be allocated to each buffer used for reading. A value of '0' specifies an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Buffer Size Min</em>' attribute.
	 * @see #setReadBufferSizeMin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_ReadBufferSizeMin()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.ReadBufferSizeMax\"]'"
	 * @generated
	 */
	Long getReadBufferSizeMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadBufferSizeMin <em>Read Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Buffer Size Min</em>' attribute.
	 * @see #getReadBufferSizeMin()
	 * @generated
	 */
	void setReadBufferSizeMin(Long value);

	/**
	 * Returns the value of the '<em><b>Read Buffer Size Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the maximum number of bytes that may be allocated to each buffer used for reading. A value of '0' specifies an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Buffer Size Max</em>' attribute.
	 * @see #setReadBufferSizeMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_ReadBufferSizeMax()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.ReadBufferSizeMin\"]'"
	 * @generated
	 */
	Long getReadBufferSizeMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadBufferSizeMax <em>Read Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Buffer Size Max</em>' attribute.
	 * @see #getReadBufferSizeMax()
	 * @generated
	 */
	void setReadBufferSizeMax(Long value);

	/**
	 * Returns the value of the '<em><b>Write Buffer Size Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the minimum number of bytes that must be allocated to each buffer used for writing. A value of '0' specifies an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Buffer Size Min</em>' attribute.
	 * @see #setWriteBufferSizeMin(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_WriteBufferSizeMin()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.WriteBufferSizeMax\"]'"
	 * @generated
	 */
	Long getWriteBufferSizeMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getWriteBufferSizeMin <em>Write Buffer Size Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Buffer Size Min</em>' attribute.
	 * @see #getWriteBufferSizeMin()
	 * @generated
	 */
	void setWriteBufferSizeMin(Long value);

	/**
	 * Returns the value of the '<em><b>Write Buffer Size Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer specifying the maximum number of bytes that may be allocated to each buffer used for writing. A value of '0' specifies an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Buffer Size Max</em>' attribute.
	 * @see #setWriteBufferSizeMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_WriteBufferSizeMax()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.WriteBufferSizeMin\"]'"
	 * @generated
	 */
	Long getWriteBufferSizeMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getWriteBufferSizeMax <em>Write Buffer Size Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Buffer Size Max</em>' attribute.
	 * @see #getWriteBufferSizeMax()
	 * @generated
	 */
	void setWriteBufferSizeMax(Long value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that specify whether attribute caching is (or is not) supported by the operational file server when accessing specific typesof objects from the underlying operational file system.The object type and the support parameters are specified in the corresponding AttributeCachingObjects, AttributeCachingTimeMin, and AttributeCachingTimeMax array properties. 
	 * Filesystem object types that can be accessed locally are represented by an entry in these arrays. The entry in the AttributeCaching array can be 'On', 'Off', or 'Unknown'. Implementation of this feature requires support from other system components, so it is quite possible that specifying 'On' may still not result in caching behavior. 'Unknown' indicates that the access operation will try to work with whatever options the operational file server and file system can support. In all cases, AttributeCachingTimeMin and AttributeCachingTimeMax provide the minimum and maximum time for which the attributes can be cached. When this Setting is used as a Goal, the client may specify 'Unknown', but the Setting in the created object should contain the supported setting, whether 'On' or 'Off'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_AttributeCaching()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"On\",\"Off\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingObjects\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMin\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMax\"]'"
	 * @generated
	 */
	EList<Integer> getAttributeCaching();

	/**
	 * Returns the value of the '<em><b>Attribute Caching Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that specify the attribute caching support provided to various object types by the operational file server when accessing the underlying operational file system. Thesetypes represent the types of objects stored in a FileSystem -- files and directories as well as others that may be defined in the future. The corresponding properties, AttributeCaching, AttributeCachingTimeMin, and AttributeCachingTimeMax provide the supported features for the type of object. 'None' and 'All' cannot both be specified; if either one is specified, it must be the first entry in the array and the entry is interpreted as the default setting for all objects. If neither 'None' or 'All' are specified, the caching settings for other objects are defaulted by the implementation. If 'Rest' is specified, the entry applies to all known object types other than the named ones. If 'Unknown' is specified it applies to object types not known to this application (this can happen when foreign file systems are mounted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching Objects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_AttributeCachingObjects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"None\",\"All\",\"Rest\",\"File\",\"Directory\",\"DMTF Reserved\",\"Vendor Defined\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.AttributeCaching\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMin\",\"CIM_LocallyAccessibleFileSystemSetting.AttributeCachingTimeMax\"]'"
	 * @generated
	 */
	EList<Integer> getAttributeCachingObjects();

	/**
	 * Returns the value of the '<em><b>Attribute Caching Time Min</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers specifying, in milliseconds, the minimum time for which an object of the type specified by the corresponding AttributeCaching property must be retained in the attribute cache. When used as a Goal, a value of '0' indicates an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching Time Min</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_AttributeCachingTimeMin()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.AttributeCaching\"]'"
	 * @generated
	 */
	EList<Long> getAttributeCachingTimeMin();

	/**
	 * Returns the value of the '<em><b>Attribute Caching Time Max</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers specifying, in milliseconds, the maximum time for which an object of the type specified by the corresponding AttributeCaching property must be retained in the attribute cache. When used as a Goal, a value of '0' indicates an implementation-specific default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching Time Max</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_AttributeCachingTimeMax()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LocallyAccessibleFileSystemSetting.AttributeCaching\"]'"
	 * @generated
	 */
	EList<Long> getAttributeCachingTimeMax();

	/**
	 * Returns the value of the '<em><b>Read Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the Read-Write policy set on the operational file system and supported by the operational file server when accessing it.'Read Only' specifies that the access to the operational file system by the operational file server is set up solely for reading. 'Read/Write' specifies that the access to the operational file system by the operational file server is set up for both reading and writing. 'Force Read/Write' specifies that 'Read-Only' has been over-ridden by a client with write access to the operational file system. This option is intended for use when the associated FileSystem has been made 'Read Only' by default, as might happen if it were created to be the target of a Synchronization or Mirror operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Write Policy</em>' attribute.
	 * @see #setReadWritePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_ReadWritePolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Read Only\",\"Read/Write\",\"Force Read/Write\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getReadWritePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadWritePolicy <em>Read Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write Policy</em>' attribute.
	 * @see #getReadWritePolicy()
	 * @generated
	 */
	void setReadWritePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies the Locking that will be enforced on the operational file system bythe operational file server when accessing it.'Enforce None' does not enforce locks. 'Enforce Write' does not allow writes to locked files. 'Enforce Read/Write' does not allow reads or writes to locked files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lock Policy</em>' attribute.
	 * @see #setLockPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_LockPolicy()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Enforce None\",\"Enforce Write\",\"Enforce Read/Write\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getLockPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getLockPolicy <em>Lock Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Policy</em>' attribute.
	 * @see #getLockPolicy()
	 * @generated
	 */
	void setLockPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Enable On System Start</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if local access from the operational file server to the operational file system should be enabled when the file server is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable On System Start</em>' attribute.
	 * @see #setEnableOnSystemStart(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_EnableOnSystemStart()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Vendor-specific Default\",\"Automatic\",\"Manual\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getEnableOnSystemStart();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getEnableOnSystemStart <em>Enable On System Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable On System Start</em>' attribute.
	 * @see #getEnableOnSystemStart()
	 * @generated
	 */
	void setEnableOnSystemStart(Integer value);

	/**
	 * Returns the value of the '<em><b>Read Write Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instance of a CIM_Privilege, encoded as a string, that expresses the default client's expectations about access to elements contained in the operational file system. The provider is expected to surface this access using the CIM privilege model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Write Pref</em>' attribute.
	 * @see #setReadWritePref(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_ReadWritePref()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_Privilege'"
	 * @generated
	 */
	String getReadWritePref();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getReadWritePref <em>Read Write Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write Pref</em>' attribute.
	 * @see #getReadWritePref()
	 * @generated
	 */
	void setReadWritePref(String value);

	/**
	 * Returns the value of the '<em><b>Execute Pref</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that specifies if support should be provided on the operational file server for executing elements contained in the operational file system accessed through this local access point. This may require setting up specialized paging or execution buffers either on the operational file server or on the operational file system side (as appropriate for the implementation). Note that this does not provide any rights to actually execute any element but only specifies support for such execution, if permitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execute Pref</em>' attribute.
	 * @see #setExecutePref(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_ExecutePref()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Execution Supported\",\"Execution Not Supported\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getExecutePref();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getExecutePref <em>Execute Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Pref</em>' attribute.
	 * @see #getExecutePref()
	 * @generated
	 */
	void setExecutePref(Integer value);

	/**
	 * Returns the value of the '<em><b>Root Access Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instance of a CIM_Privilege, encoded as a string, that expresses the default expectations about privileged access by appropriately privileged System Administrative users on the operational file server ('root' or 'superuser') to theoperational file system and its elements. The provider is expected to surface this access using the CIM privilege model. 
	 * Support for the privileged access might require setup at both the operational file server as well as the operational file system, so there is no guarantee that the request can be satisfied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Access Pref</em>' attribute.
	 * @see #setRootAccessPref(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LocallyAccessibleFileSystemSetting_RootAccessPref()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_Privilege'"
	 * @generated
	 */
	String getRootAccessPref();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LocallyAccessibleFileSystemSetting#getRootAccessPref <em>Root Access Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Access Pref</em>' attribute.
	 * @see #getRootAccessPref()
	 * @generated
	 */
	void setRootAccessPref(String value);

} // CIM_LocallyAccessibleFileSystemSetting
