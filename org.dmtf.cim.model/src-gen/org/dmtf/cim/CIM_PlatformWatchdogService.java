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
 * A representation of the model object '<em><b>CIM Platform Watchdog Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PlatformWatchdogService is class derived from Service that provides the controls to manage the watchdog timer service of a managed element. A PlatformWatchdogService monitors the ability of a monitored entity to reset a countdown timer before it expires. If the timer expires, the service may take specific action upon expiration. The monitored entity may be the Operating System, BIOS, or a software component that is installed on the computer system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getMonitoredEntityType <em>Monitored Entity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getOtherMonitoredEntityTypeDescription <em>Other Monitored Entity Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimerExpired <em>Timer Expired</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimerResolution <em>Timer Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getCurrentTimerValue <em>Current Timer Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getActionOnExpiration <em>Action On Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PlatformWatchdogService#getOtherActionOnExpiration <em>Other Action On Expiration</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Watchdog' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PlatformWatchdogService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Monitored Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of entity that is monitored by the PlatformWatchdogService. This property is used to identify the type of entity that is responsible for re-arming, or whose information is used to re-arm, the watchdog at periodic intervals. A value set to 2 = "Operating System" shall indicate that the entity is an operating system. A value set to 3 = "Operating System Boot Process" shall indicate that the entity is one which handles the process of booting an operating system. A value set to 4 = "Operating System Shutdown Process" shall indicate that the entity is one which handles process of shutting down of an operating system. A value set to 5 = "Firmware Boot Process" shall indicate that the entity is one which handles process of booting firmware. A value set to 6 = "BIOS Boot Process" shall indicate that the entity is one which handles process of booting the system BIOS. A value set to 7 = "Application" shall indicate that the entity is an application. A value set to 8 = "Service Processor" shall indicate that the entity is an service processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitored Entity Type</em>' attribute.
	 * @see #setMonitoredEntityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_MonitoredEntityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Operating System\",\"Operating System Boot Process\",\"Operating System Shutdown Process\",\"Firmware Boot Process\",\"BIOS Boot Process\",\"Application\",\"Service Processor\"]' ModelCorrespondence='[\"CIM_PlatformWatchdogService.OtherMonitoredEntityTypeDescription\"]'"
	 * @generated
	 */
	Integer getMonitoredEntityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getMonitoredEntityType <em>Monitored Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored Entity Type</em>' attribute.
	 * @see #getMonitoredEntityType()
	 * @generated
	 */
	void setMonitoredEntityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Monitored Entity Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the type of monitored entity when MonitoredEntityType is set to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Monitored Entity Type Description</em>' attribute.
	 * @see #setOtherMonitoredEntityTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_OtherMonitoredEntityTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_PlatformWatchdogService.MonitoredEntityType\"]'"
	 * @generated
	 */
	String getOtherMonitoredEntityTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getOtherMonitoredEntityTypeDescription <em>Other Monitored Entity Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Monitored Entity Type Description</em>' attribute.
	 * @see #getOtherMonitoredEntityTypeDescription()
	 * @generated
	 */
	void setOtherMonitoredEntityTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Timeout Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeout interval that is used by the watchdog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout Interval</em>' attribute.
	 * @see #setTimeoutInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_TimeoutInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeoutInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimeoutInterval <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Interval</em>' attribute.
	 * @see #getTimeoutInterval()
	 * @generated
	 */
	void setTimeoutInterval(String value);

	/**
	 * Returns the value of the '<em><b>Timer Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TimerExpired indicates when the watchdog timer has expired. A value of False shall indicate the watchdog timer did not expire the last time it was active, or this information is unknown. A value of True shall indicate the watchdog timer expired the last time it was active. If CurrentTimerValue is supported it also expresses this same information when it has the value 00000000000000.000000:000 expressed in the interval notation of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Expired</em>' attribute.
	 * @see #setTimerExpired(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_TimerExpired()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getTimerExpired();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimerExpired <em>Timer Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Expired</em>' attribute.
	 * @see #getTimerExpired()
	 * @generated
	 */
	void setTimerExpired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Timer Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resolution of the timer used by the watchdog. The timer can expire anytime between (TimeoutInterval - TimerResolution) or (TimeoutInterval + TimerResolution).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timer Resolution</em>' attribute.
	 * @see #setTimerResolution(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_TimerResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimerResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimerResolution <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Resolution</em>' attribute.
	 * @see #getTimerResolution()
	 * @generated
	 */
	void setTimerResolution(String value);

	/**
	 * Returns the value of the '<em><b>Current Timer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time remaining before the watchdog timer expires. A value of NULL shall mean unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Timer Value</em>' attribute.
	 * @see #setCurrentTimerValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_CurrentTimerValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCurrentTimerValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getCurrentTimerValue <em>Current Timer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Timer Value</em>' attribute.
	 * @see #getCurrentTimerValue()
	 * @generated
	 */
	void setCurrentTimerValue(String value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time of the last watchdog timer expiration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Expiration</em>' attribute.
	 * @see #setTimeOfLastExpiration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_TimeOfLastExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Expiration</em>' attribute.
	 * @see #getTimeOfLastExpiration()
	 * @generated
	 */
	void setTimeOfLastExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Action On Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActionOnExpiration specifies the action that should happen upon the expiration of the watchdog timer. A value set to 1 = "Other" shall indicate that the action described in OtherActionOnExpiration is to be taken. A value set to 2 = "None - Status Only" shall indicate that no action is to be taken. A value set to 3 = "System Reset" shall indicate that the action is to reset the system. A value set to 4 = "System Power Off" shall indicate that the action is to power off the system. A value set to 5 = "System Power Off, then On" shall indicate that the action is to power off the system, followed by a power-on of the system. A value set to 6 = "Generate System NonMaskableInterrupt (NMI)" shall indicate that the action is to generate a non-maskable interrupt on the system. A value set to 7 = "Generate System Management Interrupt (SMI)" shall indicate that the action is to generate a management interrupt on the system. A value set to 8 = " Reset Monitored Entity " shall indicate that the action is to reset the monitored entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action On Expiration</em>' attribute.
	 * @see #setActionOnExpiration(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_ActionOnExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"None - Status Only\",\"System Reset\",\"System Power Off\",\"System Power Off, then On\",\"Generate System NonMaskableInterrupt (NMI)\",\"Generate System Management Interrupt (SMI)\",\"Reset Monitored Entity\"]' ModelCorrespondence='[\"CIM_PlatformWatchdogService.OtherActionOnExpiration\"]'"
	 * @generated
	 */
	Integer getActionOnExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getActionOnExpiration <em>Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action On Expiration</em>' attribute.
	 * @see #getActionOnExpiration()
	 * @generated
	 */
	void setActionOnExpiration(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Action On Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property shall have a value if ActionOnExpiration contains the value 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Action On Expiration</em>' attribute.
	 * @see #setOtherActionOnExpiration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PlatformWatchdogService_OtherActionOnExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PlatformWatchdogService.ActionOnExpiration\"]'"
	 * @generated
	 */
	String getOtherActionOnExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PlatformWatchdogService#getOtherActionOnExpiration <em>Other Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Action On Expiration</em>' attribute.
	 * @see #getOtherActionOnExpiration()
	 * @generated
	 */
	void setOtherActionOnExpiration(String value);

} // CIM_PlatformWatchdogService
