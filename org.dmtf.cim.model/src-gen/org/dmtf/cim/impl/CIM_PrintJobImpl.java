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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_PrintJob;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getQueueCreationClassName <em>Queue Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getJobID <em>Job ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getSchedulingInformation <em>Scheduling Information</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getJobSize <em>Job Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getMimeTypes <em>Mime Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getRequiredPaperType <em>Required Paper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getFinishing <em>Finishing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getCopies <em>Copies</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getCharSet <em>Char Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getNaturalLanguage <em>Natural Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getNumberUp <em>Number Up</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getPrintJobStatus <em>Print Job Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getTimeCompleted <em>Time Completed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getRequiredJobSheets <em>Required Job Sheets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintJobImpl#getJobOrigination <em>Job Origination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintJobImpl extends CIM_JobImpl implements CIM_PrintJob {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueCreationClassName() <em>Queue Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueCreationClassName() <em>Queue Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String queueCreationClassName = QUEUE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueName() <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueName()
	 * @generated
	 * @ordered
	 */
	protected String queueName = QUEUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobID() <em>Job ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobID()
	 * @generated
	 * @ordered
	 */
	protected String jobID = JOB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingInformation() <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULING_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulingInformation() <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInformation()
	 * @generated
	 * @ordered
	 */
	protected String schedulingInformation = SCHEDULING_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobSize() <em>Job Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobSize() <em>Job Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSize()
	 * @generated
	 * @ordered
	 */
	protected Long jobSize = JOB_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMimeTypes() <em>Mime Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mimeTypes;

	/**
	 * The default value of the '{@link #getRequiredPaperType() <em>Required Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPaperType()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_PAPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredPaperType() <em>Required Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPaperType()
	 * @generated
	 * @ordered
	 */
	protected String requiredPaperType = REQUIRED_PAPER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinishing() <em>Finishing</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishing()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> finishing;

	/**
	 * The default value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected static final Long COPIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected Long copies = COPIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long HORIZONTAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long horizontalResolution = HORIZONTAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long VERTICAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long verticalResolution = VERTICAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharSet() <em>Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSet()
	 * @generated
	 * @ordered
	 */
	protected String charSet = CHAR_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNaturalLanguage() <em>Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURAL_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNaturalLanguage() <em>Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected String naturalLanguage = NATURAL_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberUp() <em>Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberUp()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberUp() <em>Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberUp()
	 * @generated
	 * @ordered
	 */
	protected Long numberUp = NUMBER_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrintJobStatus() <em>Print Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintJobStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRINT_JOB_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrintJobStatus() <em>Print Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintJobStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer printJobStatus = PRINT_JOB_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_COMPLETED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeCompleted() <em>Time Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCompleted()
	 * @generated
	 * @ordered
	 */
	protected String timeCompleted = TIME_COMPLETED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredJobSheets() <em>Required Job Sheets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredJobSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requiredJobSheets;

	/**
	 * The default value of the '{@link #getJobOrigination() <em>Job Origination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobOrigination()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_ORIGINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobOrigination() <em>Job Origination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobOrigination()
	 * @generated
	 * @ordered
	 */
	protected String jobOrigination = JOB_ORIGINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintJob();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueCreationClassName() {
		return queueCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueCreationClassName(String newQueueCreationClassName) {
		String oldQueueCreationClassName = queueCreationClassName;
		queueCreationClassName = newQueueCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__QUEUE_CREATION_CLASS_NAME, oldQueueCreationClassName, queueCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueName() {
		return queueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueName(String newQueueName) {
		String oldQueueName = queueName;
		queueName = newQueueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__QUEUE_NAME, oldQueueName, queueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobID() {
		return jobID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobID(String newJobID) {
		String oldJobID = jobID;
		jobID = newJobID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__JOB_ID, oldJobID, jobID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchedulingInformation() {
		return schedulingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulingInformation(String newSchedulingInformation) {
		String oldSchedulingInformation = schedulingInformation;
		schedulingInformation = newSchedulingInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__SCHEDULING_INFORMATION, oldSchedulingInformation, schedulingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobSize() {
		return jobSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobSize(Long newJobSize) {
		Long oldJobSize = jobSize;
		jobSize = newJobSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__JOB_SIZE, oldJobSize, jobSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(Integer newLanguage) {
		Integer oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMimeTypes() {
		if (mimeTypes == null) {
			mimeTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_JOB__MIME_TYPES);
		}
		return mimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequiredPaperType() {
		return requiredPaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredPaperType(String newRequiredPaperType) {
		String oldRequiredPaperType = requiredPaperType;
		requiredPaperType = newRequiredPaperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__REQUIRED_PAPER_TYPE, oldRequiredPaperType, requiredPaperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFinishing() {
		if (finishing == null) {
			finishing = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINT_JOB__FINISHING);
		}
		return finishing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCopies() {
		return copies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopies(Long newCopies) {
		Long oldCopies = copies;
		copies = newCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__COPIES, oldCopies, copies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHorizontalResolution() {
		return horizontalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalResolution(Long newHorizontalResolution) {
		Long oldHorizontalResolution = horizontalResolution;
		horizontalResolution = newHorizontalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__HORIZONTAL_RESOLUTION, oldHorizontalResolution, horizontalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVerticalResolution() {
		return verticalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalResolution(Long newVerticalResolution) {
		Long oldVerticalResolution = verticalResolution;
		verticalResolution = newVerticalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__VERTICAL_RESOLUTION, oldVerticalResolution, verticalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharSet() {
		return charSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharSet(String newCharSet) {
		String oldCharSet = charSet;
		charSet = newCharSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__CHAR_SET, oldCharSet, charSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNaturalLanguage() {
		return naturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNaturalLanguage(String newNaturalLanguage) {
		String oldNaturalLanguage = naturalLanguage;
		naturalLanguage = newNaturalLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__NATURAL_LANGUAGE, oldNaturalLanguage, naturalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberUp() {
		return numberUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberUp(Long newNumberUp) {
		Long oldNumberUp = numberUp;
		numberUp = newNumberUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__NUMBER_UP, oldNumberUp, numberUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrintJobStatus() {
		return printJobStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrintJobStatus(Integer newPrintJobStatus) {
		Integer oldPrintJobStatus = printJobStatus;
		printJobStatus = newPrintJobStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__PRINT_JOB_STATUS, oldPrintJobStatus, printJobStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeCompleted() {
		return timeCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeCompleted(String newTimeCompleted) {
		String oldTimeCompleted = timeCompleted;
		timeCompleted = newTimeCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__TIME_COMPLETED, oldTimeCompleted, timeCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRequiredJobSheets() {
		if (requiredJobSheets == null) {
			requiredJobSheets = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_JOB__REQUIRED_JOB_SHEETS);
		}
		return requiredJobSheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobOrigination() {
		return jobOrigination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobOrigination(String newJobOrigination) {
		String oldJobOrigination = jobOrigination;
		jobOrigination = newJobOrigination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_JOB__JOB_ORIGINATION, oldJobOrigination, jobOrigination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_JOB__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_PRINT_JOB__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_PRINT_JOB__QUEUE_CREATION_CLASS_NAME:
				return getQueueCreationClassName();
			case CimPackage.CIM_PRINT_JOB__QUEUE_NAME:
				return getQueueName();
			case CimPackage.CIM_PRINT_JOB__JOB_ID:
				return getJobID();
			case CimPackage.CIM_PRINT_JOB__SCHEDULING_INFORMATION:
				return getSchedulingInformation();
			case CimPackage.CIM_PRINT_JOB__JOB_SIZE:
				return getJobSize();
			case CimPackage.CIM_PRINT_JOB__LANGUAGE:
				return getLanguage();
			case CimPackage.CIM_PRINT_JOB__MIME_TYPES:
				return getMimeTypes();
			case CimPackage.CIM_PRINT_JOB__REQUIRED_PAPER_TYPE:
				return getRequiredPaperType();
			case CimPackage.CIM_PRINT_JOB__FINISHING:
				return getFinishing();
			case CimPackage.CIM_PRINT_JOB__COPIES:
				return getCopies();
			case CimPackage.CIM_PRINT_JOB__HORIZONTAL_RESOLUTION:
				return getHorizontalResolution();
			case CimPackage.CIM_PRINT_JOB__VERTICAL_RESOLUTION:
				return getVerticalResolution();
			case CimPackage.CIM_PRINT_JOB__CHAR_SET:
				return getCharSet();
			case CimPackage.CIM_PRINT_JOB__NATURAL_LANGUAGE:
				return getNaturalLanguage();
			case CimPackage.CIM_PRINT_JOB__NUMBER_UP:
				return getNumberUp();
			case CimPackage.CIM_PRINT_JOB__PRINT_JOB_STATUS:
				return getPrintJobStatus();
			case CimPackage.CIM_PRINT_JOB__TIME_COMPLETED:
				return getTimeCompleted();
			case CimPackage.CIM_PRINT_JOB__REQUIRED_JOB_SHEETS:
				return getRequiredJobSheets();
			case CimPackage.CIM_PRINT_JOB__JOB_ORIGINATION:
				return getJobOrigination();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_JOB__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__QUEUE_CREATION_CLASS_NAME:
				setQueueCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__QUEUE_NAME:
				setQueueName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_ID:
				setJobID((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__SCHEDULING_INFORMATION:
				setSchedulingInformation((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_SIZE:
				setJobSize((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__LANGUAGE:
				setLanguage((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__MIME_TYPES:
				getMimeTypes().clear();
				getMimeTypes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__REQUIRED_PAPER_TYPE:
				setRequiredPaperType((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__FINISHING:
				getFinishing().clear();
				getFinishing().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__COPIES:
				setCopies((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__HORIZONTAL_RESOLUTION:
				setHorizontalResolution((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__VERTICAL_RESOLUTION:
				setVerticalResolution((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__CHAR_SET:
				setCharSet((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__NATURAL_LANGUAGE:
				setNaturalLanguage((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__NUMBER_UP:
				setNumberUp((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__PRINT_JOB_STATUS:
				setPrintJobStatus((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__TIME_COMPLETED:
				setTimeCompleted((String)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__REQUIRED_JOB_SHEETS:
				getRequiredJobSheets().clear();
				getRequiredJobSheets().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_ORIGINATION:
				setJobOrigination((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_JOB__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__QUEUE_CREATION_CLASS_NAME:
				setQueueCreationClassName(QUEUE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__QUEUE_NAME:
				setQueueName(QUEUE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_ID:
				setJobID(JOB_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__SCHEDULING_INFORMATION:
				setSchedulingInformation(SCHEDULING_INFORMATION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_SIZE:
				setJobSize(JOB_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__MIME_TYPES:
				getMimeTypes().clear();
				return;
			case CimPackage.CIM_PRINT_JOB__REQUIRED_PAPER_TYPE:
				setRequiredPaperType(REQUIRED_PAPER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__FINISHING:
				getFinishing().clear();
				return;
			case CimPackage.CIM_PRINT_JOB__COPIES:
				setCopies(COPIES_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__HORIZONTAL_RESOLUTION:
				setHorizontalResolution(HORIZONTAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__VERTICAL_RESOLUTION:
				setVerticalResolution(VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__CHAR_SET:
				setCharSet(CHAR_SET_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__NATURAL_LANGUAGE:
				setNaturalLanguage(NATURAL_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__NUMBER_UP:
				setNumberUp(NUMBER_UP_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__PRINT_JOB_STATUS:
				setPrintJobStatus(PRINT_JOB_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__TIME_COMPLETED:
				setTimeCompleted(TIME_COMPLETED_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_JOB__REQUIRED_JOB_SHEETS:
				getRequiredJobSheets().clear();
				return;
			case CimPackage.CIM_PRINT_JOB__JOB_ORIGINATION:
				setJobOrigination(JOB_ORIGINATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_JOB__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_PRINT_JOB__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_PRINT_JOB__QUEUE_CREATION_CLASS_NAME:
				return QUEUE_CREATION_CLASS_NAME_EDEFAULT == null ? queueCreationClassName != null : !QUEUE_CREATION_CLASS_NAME_EDEFAULT.equals(queueCreationClassName);
			case CimPackage.CIM_PRINT_JOB__QUEUE_NAME:
				return QUEUE_NAME_EDEFAULT == null ? queueName != null : !QUEUE_NAME_EDEFAULT.equals(queueName);
			case CimPackage.CIM_PRINT_JOB__JOB_ID:
				return JOB_ID_EDEFAULT == null ? jobID != null : !JOB_ID_EDEFAULT.equals(jobID);
			case CimPackage.CIM_PRINT_JOB__SCHEDULING_INFORMATION:
				return SCHEDULING_INFORMATION_EDEFAULT == null ? schedulingInformation != null : !SCHEDULING_INFORMATION_EDEFAULT.equals(schedulingInformation);
			case CimPackage.CIM_PRINT_JOB__JOB_SIZE:
				return JOB_SIZE_EDEFAULT == null ? jobSize != null : !JOB_SIZE_EDEFAULT.equals(jobSize);
			case CimPackage.CIM_PRINT_JOB__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CimPackage.CIM_PRINT_JOB__MIME_TYPES:
				return mimeTypes != null && !mimeTypes.isEmpty();
			case CimPackage.CIM_PRINT_JOB__REQUIRED_PAPER_TYPE:
				return REQUIRED_PAPER_TYPE_EDEFAULT == null ? requiredPaperType != null : !REQUIRED_PAPER_TYPE_EDEFAULT.equals(requiredPaperType);
			case CimPackage.CIM_PRINT_JOB__FINISHING:
				return finishing != null && !finishing.isEmpty();
			case CimPackage.CIM_PRINT_JOB__COPIES:
				return COPIES_EDEFAULT == null ? copies != null : !COPIES_EDEFAULT.equals(copies);
			case CimPackage.CIM_PRINT_JOB__HORIZONTAL_RESOLUTION:
				return HORIZONTAL_RESOLUTION_EDEFAULT == null ? horizontalResolution != null : !HORIZONTAL_RESOLUTION_EDEFAULT.equals(horizontalResolution);
			case CimPackage.CIM_PRINT_JOB__VERTICAL_RESOLUTION:
				return VERTICAL_RESOLUTION_EDEFAULT == null ? verticalResolution != null : !VERTICAL_RESOLUTION_EDEFAULT.equals(verticalResolution);
			case CimPackage.CIM_PRINT_JOB__CHAR_SET:
				return CHAR_SET_EDEFAULT == null ? charSet != null : !CHAR_SET_EDEFAULT.equals(charSet);
			case CimPackage.CIM_PRINT_JOB__NATURAL_LANGUAGE:
				return NATURAL_LANGUAGE_EDEFAULT == null ? naturalLanguage != null : !NATURAL_LANGUAGE_EDEFAULT.equals(naturalLanguage);
			case CimPackage.CIM_PRINT_JOB__NUMBER_UP:
				return NUMBER_UP_EDEFAULT == null ? numberUp != null : !NUMBER_UP_EDEFAULT.equals(numberUp);
			case CimPackage.CIM_PRINT_JOB__PRINT_JOB_STATUS:
				return PRINT_JOB_STATUS_EDEFAULT == null ? printJobStatus != null : !PRINT_JOB_STATUS_EDEFAULT.equals(printJobStatus);
			case CimPackage.CIM_PRINT_JOB__TIME_COMPLETED:
				return TIME_COMPLETED_EDEFAULT == null ? timeCompleted != null : !TIME_COMPLETED_EDEFAULT.equals(timeCompleted);
			case CimPackage.CIM_PRINT_JOB__REQUIRED_JOB_SHEETS:
				return requiredJobSheets != null && !requiredJobSheets.isEmpty();
			case CimPackage.CIM_PRINT_JOB__JOB_ORIGINATION:
				return JOB_ORIGINATION_EDEFAULT == null ? jobOrigination != null : !JOB_ORIGINATION_EDEFAULT.equals(jobOrigination);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", QueueCreationClassName: ");
		result.append(queueCreationClassName);
		result.append(", QueueName: ");
		result.append(queueName);
		result.append(", JobID: ");
		result.append(jobID);
		result.append(", SchedulingInformation: ");
		result.append(schedulingInformation);
		result.append(", JobSize: ");
		result.append(jobSize);
		result.append(", Language: ");
		result.append(language);
		result.append(", MimeTypes: ");
		result.append(mimeTypes);
		result.append(", RequiredPaperType: ");
		result.append(requiredPaperType);
		result.append(", Finishing: ");
		result.append(finishing);
		result.append(", Copies: ");
		result.append(copies);
		result.append(", HorizontalResolution: ");
		result.append(horizontalResolution);
		result.append(", VerticalResolution: ");
		result.append(verticalResolution);
		result.append(", CharSet: ");
		result.append(charSet);
		result.append(", NaturalLanguage: ");
		result.append(naturalLanguage);
		result.append(", NumberUp: ");
		result.append(numberUp);
		result.append(", PrintJobStatus: ");
		result.append(printJobStatus);
		result.append(", TimeCompleted: ");
		result.append(timeCompleted);
		result.append(", RequiredJobSheets: ");
		result.append(requiredJobSheets);
		result.append(", JobOrigination: ");
		result.append(jobOrigination);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintJobImpl
