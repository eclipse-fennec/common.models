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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM CLP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A representation of a communication endpoint where the CLP protocol may be accessed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getCurrentDefaultTarget <em>Current Default Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getKeepTime <em>Keep Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getWaitBehavior <em>Wait Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputVerbosity <em>Output Verbosity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputLanguage <em>Output Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputPosition <em>Output Position</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputOrder <em>Output Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputCount <em>Output Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getDisplayOption <em>Display Option</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_CLPProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Current Default Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the Current Default Target when a CLP Session is established. The Current Default Target is the CLP session environment setting that establishes a default base address for all command targets that are expressed as a relative target address and is used as the command target if no command target is specified in a command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Default Target</em>' attribute.
	 * @see #setCurrentDefaultTarget(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_CurrentDefaultTarget()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_CLPSettingData.CurrentDefaultTarget\"]'"
	 * @generated
	 */
	String getCurrentDefaultTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getCurrentDefaultTarget <em>Current Default Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Default Target</em>' attribute.
	 * @see #getCurrentDefaultTarget()
	 * @generated
	 */
	void setCurrentDefaultTarget(String value);

	/**
	 * Returns the value of the '<em><b>Keep Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time in seconds that the CLP Session should retain a CLP command job status. A KeepTime value of zero shall be interpreted to mean keep forever.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Time</em>' attribute.
	 * @see #setKeepTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_KeepTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' Units='Seconds' ModelCorrespondence='[\"CIM_CLPSettingData.KeepTime\"]' PUnit='second'"
	 * @generated
	 */
	Integer getKeepTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getKeepTime <em>Keep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Time</em>' attribute.
	 * @see #getKeepTime()
	 * @generated
	 */
	void setKeepTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Wait Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When TRUE the CLP Session will not return a command response until all spawned jobs have completed, otherwise it may.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait Behavior</em>' attribute.
	 * @see #setWaitBehavior(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_WaitBehavior()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_CLPSettingData.WaitBehavior\"]'"
	 * @generated
	 */
	Boolean getWaitBehavior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getWaitBehavior <em>Wait Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Behavior</em>' attribute.
	 * @see #getWaitBehavior()
	 * @generated
	 */
	void setWaitBehavior(Boolean value);

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OutputFormat establishes the default CLP Session command output format, as described in SM CLP Specification, DMTF document DSP0214.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see #setOutputFormat(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Text\",\"clpcsv\",\"Keyword\",\"clpxml\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CLPSettingData.OutputFormat\"]'"
	 * @generated
	 */
	Integer getOutputFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Output Verbosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OutputVerbosity establishes the default CLP Session output level of detail, as described in SM CLP Specification, DMTF document DSP0214.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Verbosity</em>' attribute.
	 * @see #setOutputVerbosity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputVerbosity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Error\",\"Terse\",\"Verbose\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CLPSettingData.OutputVerbosity\"]'"
	 * @generated
	 */
	Integer getOutputVerbosity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputVerbosity <em>Output Verbosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Verbosity</em>' attribute.
	 * @see #getOutputVerbosity()
	 * @generated
	 */
	void setOutputVerbosity(Integer value);

	/**
	 * Returns the value of the '<em><b>Output Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default CLP Session command output language. As described in SM CLP Specification, DMTF document DSP0214, the language value is a 3-character string identifier of language as specified in ISO 639.2; "eng" is the default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Language</em>' attribute.
	 * @see #setOutputLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_CLPSettingData.OutputLanguage\"]'"
	 * @generated
	 */
	String getOutputLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputLanguage <em>Output Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Language</em>' attribute.
	 * @see #getOutputLanguage()
	 * @generated
	 */
	void setOutputLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Output Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OutputPosition establishes the default CLP Session command output beginning position when multiple items are returned in the command output, as described in SM CLP Specification, DMTF document DSP0214.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Position</em>' attribute.
	 * @see #setOutputPosition(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputPosition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Begin\",\"End\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CLPSettingData.OutputPosition\"]'"
	 * @generated
	 */
	Integer getOutputPosition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputPosition <em>Output Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Position</em>' attribute.
	 * @see #getOutputPosition()
	 * @generated
	 */
	void setOutputPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>Output Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OutputOrder establishes the default CLP Session command output order when multiple items are returned in the command output as described in SM CLP Specification, DMTF document DSP0214.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Order</em>' attribute.
	 * @see #setOutputOrder(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Default\",\"Reverse\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_CLPSettingData.OutputOrder\"]'"
	 * @generated
	 */
	Integer getOutputOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputOrder <em>Output Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Order</em>' attribute.
	 * @see #getOutputOrder()
	 * @generated
	 */
	void setOutputOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Output Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Establishes the default CLP Session command output count number when multiple items are returned in the output as described in SM CLP Specification, DMTF document DSP0214. The value 0xFFFFFFFF shall be interpreted to mean that all items are to be returned. The maximum value for the count number is determined by the class of the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Count</em>' attribute.
	 * @see #setOutputCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_OutputCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' ModelCorrespondence='[\"CIM_CLPSettingData.OutputCount\"]'"
	 * @generated
	 */
	Long getOutputCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getOutputCount <em>Output Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Count</em>' attribute.
	 * @see #getOutputCount()
	 * @generated
	 */
	void setOutputCount(Long value);

	/**
	 * Returns the value of the '<em><b>Display Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maintains the session default value for the display option. The argument string is stored "as-is" without normalization beyond capitalization. The argument string is compliant with the SM CLP command line grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Option</em>' attribute.
	 * @see #setDisplayOption(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CLPProtocolEndpoint_DisplayOption()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_CLPSettingData.DisplayOption\"]'"
	 * @generated
	 */
	String getDisplayOption();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CLPProtocolEndpoint#getDisplayOption <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option</em>' attribute.
	 * @see #getDisplayOption()
	 * @generated
	 */
	void setDisplayOption(String value);

} // CIM_CLPProtocolEndpoint
