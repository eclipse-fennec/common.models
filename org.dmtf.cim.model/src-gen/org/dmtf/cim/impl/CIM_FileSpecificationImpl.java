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

import org.dmtf.cim.CIM_FileSpecification;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getCreateTimeStamp <em>Create Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getCRC1 <em>CRC1</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getCRC2 <em>CRC2</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSpecificationImpl#getMD5Checksum <em>MD5 Checksum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSpecificationImpl extends CIM_CheckImpl implements CIM_FileSpecification {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateTimeStamp() <em>Create Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateTimeStamp() <em>Create Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String createTimeStamp = CREATE_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long FILE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected Long fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected Long checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRC1() <em>CRC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRC1()
	 * @generated
	 * @ordered
	 */
	protected static final Long CRC1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRC1() <em>CRC1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRC1()
	 * @generated
	 * @ordered
	 */
	protected Long crc1 = CRC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRC2() <em>CRC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRC2()
	 * @generated
	 * @ordered
	 */
	protected static final Long CRC2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRC2() <em>CRC2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRC2()
	 * @generated
	 * @ordered
	 */
	protected Long crc2 = CRC2_EDEFAULT;

	/**
	 * The default value of the '{@link #getMD5Checksum() <em>MD5 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMD5Checksum()
	 * @generated
	 * @ordered
	 */
	protected static final String MD5_CHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMD5Checksum() <em>MD5 Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMD5Checksum()
	 * @generated
	 * @ordered
	 */
	protected String md5Checksum = MD5_CHECKSUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateTimeStamp() {
		return createTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateTimeStamp(String newCreateTimeStamp) {
		String oldCreateTimeStamp = createTimeStamp;
		createTimeStamp = newCreateTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__CREATE_TIME_STAMP, oldCreateTimeStamp, createTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSize(Long newFileSize) {
		Long oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckSum(Long newCheckSum) {
		Long oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCRC1() {
		return crc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRC1(Long newCRC1) {
		Long oldCRC1 = crc1;
		crc1 = newCRC1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__CRC1, oldCRC1, crc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCRC2() {
		return crc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRC2(Long newCRC2) {
		Long oldCRC2 = crc2;
		crc2 = newCRC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__CRC2, oldCRC2, crc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMD5Checksum() {
		return md5Checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMD5Checksum(String newMD5Checksum) {
		String oldMD5Checksum = md5Checksum;
		md5Checksum = newMD5Checksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SPECIFICATION__MD5_CHECKSUM, oldMD5Checksum, md5Checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_NAME:
				return getFileName();
			case CimPackage.CIM_FILE_SPECIFICATION__CREATE_TIME_STAMP:
				return getCreateTimeStamp();
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_SIZE:
				return getFileSize();
			case CimPackage.CIM_FILE_SPECIFICATION__CHECK_SUM:
				return getCheckSum();
			case CimPackage.CIM_FILE_SPECIFICATION__CRC1:
				return getCRC1();
			case CimPackage.CIM_FILE_SPECIFICATION__CRC2:
				return getCRC2();
			case CimPackage.CIM_FILE_SPECIFICATION__MD5_CHECKSUM:
				return getMD5Checksum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CREATE_TIME_STAMP:
				setCreateTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_SIZE:
				setFileSize((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CHECK_SUM:
				setCheckSum((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CRC1:
				setCRC1((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CRC2:
				setCRC2((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__MD5_CHECKSUM:
				setMD5Checksum((String)newValue);
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
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CREATE_TIME_STAMP:
				setCreateTimeStamp(CREATE_TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CRC1:
				setCRC1(CRC1_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__CRC2:
				setCRC2(CRC2_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SPECIFICATION__MD5_CHECKSUM:
				setMD5Checksum(MD5_CHECKSUM_EDEFAULT);
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
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case CimPackage.CIM_FILE_SPECIFICATION__CREATE_TIME_STAMP:
				return CREATE_TIME_STAMP_EDEFAULT == null ? createTimeStamp != null : !CREATE_TIME_STAMP_EDEFAULT.equals(createTimeStamp);
			case CimPackage.CIM_FILE_SPECIFICATION__FILE_SIZE:
				return FILE_SIZE_EDEFAULT == null ? fileSize != null : !FILE_SIZE_EDEFAULT.equals(fileSize);
			case CimPackage.CIM_FILE_SPECIFICATION__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case CimPackage.CIM_FILE_SPECIFICATION__CRC1:
				return CRC1_EDEFAULT == null ? crc1 != null : !CRC1_EDEFAULT.equals(crc1);
			case CimPackage.CIM_FILE_SPECIFICATION__CRC2:
				return CRC2_EDEFAULT == null ? crc2 != null : !CRC2_EDEFAULT.equals(crc2);
			case CimPackage.CIM_FILE_SPECIFICATION__MD5_CHECKSUM:
				return MD5_CHECKSUM_EDEFAULT == null ? md5Checksum != null : !MD5_CHECKSUM_EDEFAULT.equals(md5Checksum);
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
		result.append(" (FileName: ");
		result.append(fileName);
		result.append(", CreateTimeStamp: ");
		result.append(createTimeStamp);
		result.append(", FileSize: ");
		result.append(fileSize);
		result.append(", CheckSum: ");
		result.append(checkSum);
		result.append(", CRC1: ");
		result.append(crc1);
		result.append(", CRC2: ");
		result.append(crc2);
		result.append(", MD5Checksum: ");
		result.append(md5Checksum);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSpecificationImpl
